package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html ng-app=\"myModule\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Angular JS tutorial</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"angularjs/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"app/Script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div ng-Controller=\"myController\">\r\n");
      out.write("\t\t<table border ='1'>\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>Likes</th>\r\n");
      out.write("\t\t\t\t<th>Dislikes</th>\r\n");
      out.write("\t\t\t\t<th>Like/Dislike</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr ng-repeat=\"technology in technologies\">\r\n");
      out.write("\t\t\t\t\t<td>{{technology.name}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{technology.likes}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{technology.dislikes}}</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type='button' value='Like' ng-click=\"incrementLikes(technology)\">\r\n");
      out.write("\t\t\t\t\t\t<input type='button' value='Dislike' ng-click=\"incrementDislikes(technology)\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tRow to display <input type=\"number\" step=\"1\" min=\"0\" max=\"5\" ng-model=\"rowLimit\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table border = \"1\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>DOB</th>\r\n");
      out.write("\t\t\t<th>Gender</th>\r\n");
      out.write("\t\t\t<th>Salary(num)</th>\r\n");
      out.write("\t\t\t<th>Salary(currency)</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr ng-repeat=\"employee in employees | limitTo:rowLimit\">\r\n");
      out.write("\t\t\t\t<td>{{employee.name}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.dateOfBirth |date:\"dd/MM/yyyy\"}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.gender | lowercase}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.salary |number: 2}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.salary | currency:\"$\":2 }}</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\tSorting\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<table border = \"1\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th ng-click=\"sortData('name')\">Name<div ng-class=\"getSortClass('name')\"></div></th>\r\n");
      out.write("\t\t\t<th ng-click=\"sortData('dateOfBirth')\">DOB<div ng-class=\"getSortClass('dateOfBirth')\"></th>\r\n");
      out.write("\t\t\t<th ng-click=\"sortData('gender')\">Gender<div ng-class=\"getSortClass('gender')\"></th>\r\n");
      out.write("\t\t\t<th ng-click=\"sortData('salary')\">Salary(num)<div ng-class=\"getSortClass('salary')\"></th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr ng-repeat=\"employee in employees2 | orderBy: sortColumn:reverseSort \">\r\n");
      out.write("\t\t\t\t<td>{{employee.name}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.dateOfBirth |date:\"dd/MM/yyyy\"}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.gender | lowercase}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.salary |number: 2}}</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t<div  class=\"col-md-6\">\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"search employees\" ng-model=\"searchText.name\" class='form-control' style=\"margin:10px\"> <!-- if want to have general, just searchText -->\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"search Gender\" ng-model=\"searchText.gender\" class='form-control' style=\"margin:10px\"> \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table class=\"table\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>DOB</th>\r\n");
      out.write("\t\t\t<th>Gender</th>\r\n");
      out.write("\t\t\t<th>Salary(num)</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr ng-repeat=\"employee in employees3 | filter: searchText\">\r\n");
      out.write("\t\t\t\t<td>{{employee.name}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.dateOfBirth |date:\"dd/MM/yyyy\"}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.gender |lowercase}}</td>\r\n");
      out.write("\t\t\t\t<td>{{employee.salary |number: 2}}</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class='col-md-8'></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
