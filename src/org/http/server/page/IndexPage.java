package org.http.server.page;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {
	public IndexPage(PrintWriter _out){
		super(_out);
		super.addTitle("��ҳ");
		super.addBody("<div align='center'>");
		super.addBody("<h3>Lius ������ʾ��</h3>");
		super.addBody("<img src='/shot_pic' width='80%' />");
		super.addBody("</div>");
	}
}
