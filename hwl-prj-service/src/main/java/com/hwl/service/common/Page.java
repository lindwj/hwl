package com.hwl.service.common;


import java.io.Serializable;

public class Page implements Serializable{
	private static final long serialVersionUID = 1L;
	private int showCount = 16;
	private int totalPage;
	private int totalResult;
	private int currentPage;
	private int currentResult;
	private boolean entityOrField;
	private String pageStr;

	public int getTotalPage() {
		if (this.totalResult % this.showCount == 0)
			this.totalPage = (this.totalResult / this.showCount);
		else
			this.totalPage = (this.totalResult / this.showCount + 1);
		return this.totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalResult() {
		return this.totalResult;
	}

	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}

	public int getCurrentPage() {
		if (this.currentPage <= 0)
			this.currentPage = 1;
		if (this.currentPage > getTotalPage())
			this.currentPage = getTotalPage();
		return this.currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getPageStr() {
		StringBuffer sb = new StringBuffer();
		if (this.totalResult > 0) {
			sb.append(" <ul>\n");
			if (this.currentPage == 1) {
				sb.append(" <li class=\"pageinfo\">首页</li>\n");
				sb.append(" <li class=\"pageinfo\">上页</li>\n");
			} else {
				sb.append(" <li><a href=\"#@\" onclick=\"nextPage(1)\">首页</a></li>\n");
				sb.append(new StringBuilder().append(" <li><a href=\"#@\" onclick=\"nextPage(")
						.append(this.currentPage - 1).append(")\">上页</a></li>\n").toString());
			}

			int showTag = 3;
			int startTag = 1;
			if (this.currentPage > showTag) {
				startTag = this.currentPage - 1;
			}
			int endTag = startTag + showTag - 1;
			for (int i = startTag; (i <= this.totalPage) && (i <= endTag); i++) {
				if (this.currentPage == i)
					sb.append(new StringBuilder().append("<li class=\"current\">").append(i).append("</li>\n")
							.toString());
				else {
					sb.append(new StringBuilder().append(" <li><a href=\"#@\" onclick=\"nextPage(").append(i)
							.append(")\">").append(i).append("</a></li>\n").toString());
				}
			}
			if (this.currentPage == this.totalPage) {
				sb.append(" <li class=\"pageinfo\">下页</li>\n");
				sb.append(" <li class=\"pageinfo\">尾页</li>\n");
			} else {
				sb.append(new StringBuilder().append(" <li><a href=\"#@\" onclick=\"nextPage(")
						.append(this.currentPage + 1).append(")\">下页</a></li>\n").toString());

				sb.append(new StringBuilder().append(" <li><a href=\"#@\" onclick=\"nextPage(").append(this.totalPage)
						.append(")\">尾页</a></li>\n").toString());
			}

			sb.append(new StringBuilder().append(" <li class=\"pageinfo\">第").append(this.currentPage)
					.append("页</li>\n").toString());
			sb.append(new StringBuilder().append(" <li class=\"pageinfo\">共").append(this.totalPage).append("页</li>\n")
					.toString());
			sb.append("</ul>\n");
			sb.append("<script type=\"text/javascript\">\n");
			sb.append("function nextPage(page){");
			sb.append(" if(true && document.forms[0]){\n");
			sb.append("     var url = document.forms[0].getAttribute(\"action\");\n");
			sb.append(new StringBuilder().append("     if(url.indexOf('?')>-1){url += \"&")
					.append(this.entityOrField ? "currentPage" : "page.currentPage").append("=\";}\n").toString());

			sb.append(new StringBuilder().append("     else{url += \"?")
					.append(this.entityOrField ? "currentPage" : "page.currentPage").append("=\";}\n").toString());

			sb.append("     document.forms[0].action = url+page;\n");
			sb.append("     document.forms[0].submit();\n");
			sb.append(" }else{\n");
			sb.append("     var url = document.location+';\n");
			sb.append("     if(url.indexOf('?')>-1){\n");
			sb.append("         if(url.indexOf('currentPage')>-1){\n");
			sb.append("             var reg = /currentPage=\\d*/g;\n");
			sb.append("             url = url.replace(reg,'currentPage=');\n");
			sb.append("         }else{\n");
			sb.append(new StringBuilder().append("             url += \"&")
					.append(this.entityOrField ? "currentPage" : "page.currentPage").append("=\";\n").toString());

			sb.append("         }\n");
			sb.append(new StringBuilder().append("     }else{url += \"?")
					.append(this.entityOrField ? "currentPage" : "page.currentPage").append("=\";}\n").toString());

			sb.append("     document.location = url + page;\n");
			sb.append(" }\n");
			sb.append("}\n");
			sb.append("</script>\n");
		}
		this.pageStr = sb.toString();
		return this.pageStr;
	}

	public void setPageStr(String pageStr) {
		this.pageStr = pageStr;
	}

	public int getShowCount() {
		return this.showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}

	public int getCurrentResult() {
		this.currentResult = ((getCurrentPage() - 1) * getShowCount());
		if (this.currentResult < 0)
			this.currentResult = 0;
		return this.currentResult;
	}

	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}

	public boolean isEntityOrField() {
		return this.entityOrField;
	}

	public void setEntityOrField(boolean entityOrField) {
		this.entityOrField = entityOrField;
	}
}
