package org.http.server.page;

import java.io.PrintWriter;

public class ErrorPage extends HtmlPage {
	public ErrorPage(PrintWriter _out){
		super(_out);
		addTitle("����");
		super.addBody("<div align='center'>");
		super.addBody("<br/><h3>������   ");
		super.addBody("<a href='/'>��ҳ</a>|<a href='/modify.html'>����Post����</a>");
		super.addBody("</h3><br/>");
		super.addBody("<img src='/pic/error.jpg' />");
		super.addBody("</div>");
	}
}
