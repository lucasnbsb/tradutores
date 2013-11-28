package node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Util {
	public Map<String, String> variables = new LinkedHashMap<String, String>();

	public static String escape(String str) {
		Charset characterSet = Charset.forName("US-ASCII");
		byte[] bytes = str.getBytes(characterSet);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < bytes.length - 1; i++) {
			result.append("(char)" + bytes[i] + "+" + '"' + '"' + "+ ");
		}
		result.append("(char)" + bytes[bytes.length - 1]);
		return result.toString();
	}

	public static String hashIn(String id, String algorithm) {
		String s = id;
		String salt = "f2e3e25e63be9acbb82c1e0ba8eabae6";
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		String res = s + salt;
		m.update(res.getBytes(), 0, s.length());
		String resultado = new BigInteger(1, m.digest()).toString(16);
		resultado = "_" + resultado;
		return resultado.toString();
	}

	public void scramble(String[] codigo) {
		StringBuffer buffer = new StringBuffer();
		FileWriter fl = null;
		try {
			fl = new FileWriter("codigo.java");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			fl.append(buffer);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fl.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File file = new File("intermediateCode.java");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			FileWriter fw = null;
			try {
				fw = new FileWriter(file.getAbsoluteFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
		}
	}
}
