package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testmap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false\"></script>\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Test Map</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Test Map</h1>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var mapOptions;\r\n");
      out.write("\t  var markers = [];\r\n");
      out.write("\t var map;\r\n");
      out.write("\t function initialize() {\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t  var latlng = new google.maps.LatLng(-25.363882, 131.044922);\r\n");
      out.write("\t\tmapOptions = {\r\n");
      out.write("\t \tzoom: 12,\r\n");
      out.write("\t \tcenter: latlng,\r\n");
      out.write("\t \tmapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("\t   };\r\n");
      out.write("\t   \r\n");
      out.write("\t    \r\n");
      out.write("\t   $(document).ready(function () {\r\n");
      out.write("\t\t \tmap = new google.maps.Map(document.getElementById(\"map_canvas\"), mapOptions);\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t \r\n");
      out.write("\t   createMarker(latlng);\r\n");
      out.write("\t   \r\n");
      out.write("\t\t\t    \t \r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t function createMarker(location){\r\n");
      out.write("\t\t \r\n");
      out.write("\t marker=new google.maps.Marker({\r\n");
      out.write("\t\t   position:location,\r\n");
      out.write("\t\t   icon:'http://www.google.com/mapfiles/marker.png',\r\n");
      out.write("\t\t  //animation:google.maps.Animation.BOUNCE\r\n");
      out.write("\t\t   });\r\n");
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t address = \"<h1>SOMETHING restARANDJ</h1>;\"\r\n");
      out.write("\t\t var infowindow = new google.maps.InfoWindow({\r\n");
      out.write("\t\t\t   content:address\r\n");
      out.write("\t\t\t   });\r\n");
      out.write("\r\n");
      out.write("\t\t\t infowindow.open(map,marker);\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t marker.setMap(map)\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<table><tr><td width=\"10\" colspan=\"2\"> <div id=\"map_canvas\" style=\"width: 580px; height: 500px\"></div></td></tr></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("google.maps.event.addDomListener(window, 'load', initialize);\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
