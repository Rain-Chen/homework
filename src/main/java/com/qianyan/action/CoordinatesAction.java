package com.qianyan.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qianyan.bean.Point;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 14-11-10
 * Time: 下午7:27.
 */
public class CoordinatesAction extends ActionSupport{

    private Point point;
    private HttpServletRequest request = ServletActionContext.getRequest();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String execute() throws Exception {
        request.setAttribute("msg", "类型转换成功");
        System.out.println(point);
        request.setAttribute("xcoor",getPoint().getXcoor());
        request.setAttribute("ycoor",getPoint().getYcoor());
        System.out.println("well deal...");
        return SUCCESS;
    }
}
