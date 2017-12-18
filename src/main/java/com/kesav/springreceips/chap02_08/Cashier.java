package com.kesav.springreceips.chap02_08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

import com.kesav.springreceips.chap02.ShoppingCart;

public class Cashier {

	private String filename;
	private String path;
	private BufferedWriter writer;

	public void setPath(String path) {
		this.path = path;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void openFile() throws IOException {
		File targetDir = new File(path);
		if (!targetDir.exists()) {
			targetDir.mkdirs();
		}
		File checkoutFile = new File(path, filename + ".txt");
		if (!checkoutFile.exists()) {
			checkoutFile.createNewFile();
		}
		writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(checkoutFile, true)));
	}

	public void checkout(ShoppingCart cart) throws IOException {
		writer.write(new Date() + "\t" + cart.getProducts() + "\r\n");
		writer.flush();
	}

	public void close() throws IOException {
		writer.close();
	}

}