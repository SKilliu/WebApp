package ua.skiliushyk.tag.jsp1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {
	private static final long serialVersionUID = 7941020145352944930L;

	public int doStartTag() throws JspException {
		try {
			JspWriter out = pageContext.getOut();
			out.println("Current date: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
			return SKIP_BODY;
		} catch (IOException e) {
			throw new JspException(e);
		}
	} 
}
