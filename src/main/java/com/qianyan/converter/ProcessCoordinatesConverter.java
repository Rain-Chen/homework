package com.qianyan.converter;

import com.qianyan.bean.Point;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 14-11-10
 * Time: 下午7:20.
 */
public class ProcessCoordinatesConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Point point = new Point();
        if (strings != null && strings.length != 0) {
            String points[] = strings[0].split(",");
            int xcoor = Integer.parseInt(points[0]);
            int ycoor = Integer.parseInt(points[1]);
            point.setXcoor(xcoor);
            point.setYcoor(ycoor);
        }
        return point;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Point point = (Point) o;
        int xcoor = point.getXcoor();
        int ycoor = point.getYcoor();
        String result = "x=" + xcoor + ", y=" + ycoor;
        return result;
    }
}
