package com.java1824.ov;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class Piao extends SimpleTagSupport {


    PageContext pc;

    @Override
    public void setJspContext(JspContext pc) {
        this.pc = (PageContext) pc;
    }

    @Override
    public void doTag() throws JspException, IOException {
        pc.getOut().write("doTag");
    }
}
