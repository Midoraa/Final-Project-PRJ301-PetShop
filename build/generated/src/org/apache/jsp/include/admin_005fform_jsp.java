package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!sessionScope.user.userRole.equals('admin')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
 response.sendRedirect("index.jsp");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\r');
      out.write('\n');
      model.repository.AdminRepository show = null;
      synchronized (_jspx_page_context) {
        show = (model.repository.AdminRepository) _jspx_page_context.getAttribute("show", PageContext.PAGE_SCOPE);
        if (show == null){
          show = new model.repository.AdminRepository();
          _jspx_page_context.setAttribute("show", show, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid pt-5 \">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\r\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Welcome admin</h6>\r\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Admin management page</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-12 statistical d-flex justify-content-around mb-5\">\r\n");
      out.write("                <div class=\"d-flex register m-1\">\r\n");
      out.write("                    <div style=\"background-color: orange;\" class=\"icon\"><i class=\"fa-solid fa-person-circle-check\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"detail\">\r\n");
      out.write("                        <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAmountUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    <div>account registrant</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex user m-1\">\r\n");
      out.write("                <div style=\"background-color: rgba(0, 0, 255, 0.726);\" class=\"icon\"><i\r\n");
      out.write("                        class=\" fa-solid fa-user\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getCustomerOrder()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    <div>customer has at least 1 order</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex pet-sold m-1\">\r\n");
      out.write("                <div style=\"background-color: #7AB730;\" class=\"icon\"><i class=\"fa-solid fa-paw\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120</div>\r\n");
      out.write("                    <div>total pet sold</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex service m-1\">\r\n");
      out.write("                <div style=\"background-color: rgb(255, 108, 133);\" class=\"icon\"><i\r\n");
      out.write("                        class=\"fa-solid fa-hand-holding-heart\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120</div>\r\n");
      out.write("                    <div>total service used</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex money m-1\">\r\n");
      out.write("                <div style=\"background-color: rgb(204, 0, 204);\" class=\"icon\"><i class=\" fa-solid fa-coins\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120.000.000</div>\r\n");
      out.write("                    <div>revenue</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Thêm Food -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-2 col-md-2\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\"\r\n");
      out.write("        data-bs-whatever=\"@mdo\">Thêm Food</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Thêm Food</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"addfood\" method=\"post\" enctype=\"multipart/form-data\" accept-charset=\"UTF-8\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fname\" class=\"col-form-label\">Food Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"fname\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"ftype\" class=\"col-form-label\">Food Type:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"ftype\" name=\"productType\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fprice\" class=\"col-form-label\">Food Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"fprice\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"famount\" class=\"col-form-label\">Food Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"famount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fpic\" class=\"col-form-label\">Food Picture:</label>\r\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"fpic\" name=\"file\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" >Add</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Thêm Pet -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-2 col-md-2\" data-bs-toggle=\"modal\" data-bs-target=\"#addPet\"\r\n");
      out.write("        data-bs-whatever=\"@mdo\">Thêm Pet</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"addPet\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Thêm Pet</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"addpet\" method=\"post\" enctype=\"multipart/form-data\" accept-charset=\"UTF-8\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"name\" class=\"col-form-label\">Pet Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"color\" class=\"col-form-label\">Pet Color:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"color\" name=\"petColor\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"type\" class=\"col-form-label\">Pet Type:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"type\" name=\"productType\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"price\" class=\"col-form-label\">Pet Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"price\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"amount\" class=\"col-form-label\">Pet Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"amount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"pic\" class=\"col-form-label\">Pet Picture:</label>\r\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"pic\" name=\"file\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ------List Food----- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-2 col-md-2\" data-bs-toggle=\"modal\" data-bs-target=\"#listFood\">\r\n");
      out.write("    List Food\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"listFood\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">List Food</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <td>FoodID</td>\r\n");
      out.write("                    <td>FoodName</td>\r\n");
      out.write("                    <td>FoodType</td>\r\n");
      out.write("                    <td>FoodPrice</td>\r\n");
      out.write("                    <td>FoodAmount</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--Update Food-->\r\n");
      out.write("<div class=\"modal fade\" id=\"updateFood\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Update Food</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"updateFood\" method=\"post\" >\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"foodname\" class=\"col-form-label\">Food Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"foodname\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"ftype\" class=\"col-form-label\">Food Type:</label>\r\n");
      out.write("                        <select name=\"productType\" id=\"foodtype\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"dogFood\">Thức ăn cho chó</option>\r\n");
      out.write("                            <option value=\"catFood\">Thức ăn cho mèo</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fprice\" class=\"col-form-label\">Food Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"foodprice\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"famount\" class=\"col-form-label\">Food Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"foodamount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\"  class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"updateFood()\">Update</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ------List Pet------- -->\r\n");
      out.write("\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-2 col-md-2\" data-bs-toggle=\"modal\" data-bs-target=\"#listPet\">\r\n");
      out.write("    List Pet\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"listPet\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">List Pet</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead class=\"thead-dark w-100\">\r\n");
      out.write("                    <td>PetID</td>\r\n");
      out.write("                    <td>PetName</td>\r\n");
      out.write("                    <td>PetColor</td>\r\n");
      out.write("                    <td>FoodType</td>\r\n");
      out.write("                    <td>FoodPrice</td>\r\n");
      out.write("                    <td>FoodAmount</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"w-100\">\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--update Pet-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"updatePet\" tabindex=\"-1\" aria-labelledby=\"updatePet\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Update Pet</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"updatepet\" method=\"post\" >\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"name\" class=\"col-form-label\">Pet Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"petname\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"color\" class=\"col-form-label\">Pet Color:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"petcolor\" name=\"petColor\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"type\" class=\"col-form-label\">Pet Type:</label>\r\n");
      out.write("                        <select class=\"form-control\" name=\"productType\" id=\"pettype\">\r\n");
      out.write("                            <option value=\"dog\">Chó</option>\r\n");
      out.write("                            <option value=\"cat\">Mèo</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"price\" class=\"col-form-label\">Pet Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"petprice\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"amount\" class=\"col-form-label\">Pet Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"petamount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button  type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"updatePet()\">Update</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- ----------Duyệt đơn hàng--------- -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-2 col-md-2\" data-bs-toggle=\"modal\" data-bs-target=\"#accept\">\r\n");
      out.write("    Order Accept\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"accept\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Duyệt đơn hàng</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead class=\"thead-dark w-100\">\r\n");
      out.write("                    <td style=\"padding-left:5px;\">Mã đơn hàng</td>\r\n");
      out.write("                    <td>Người mua</td>\r\n");
      out.write("                    <td>Ngày đặt</td>\r\n");
      out.write("                    <td>Mã giảm giá</td>\r\n");
      out.write("                    <td>Tổng tiền</td>\r\n");
      out.write("                    <td>Tình trạng</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"w-100\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Style -->\r\n");
      out.write("<style>\r\n");
      out.write("    .statistical .icon {\r\n");
      out.write("\r\n");
      out.write("        color: white;\r\n");
      out.write("        align-self: center;\r\n");
      out.write("        padding: 30px 20px;\r\n");
      out.write("        font-size: xx-large;\r\n");
      out.write("        border-radius: 10% 0 0 10%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .detail {\r\n");
      out.write("        background-color: rgba(128, 128, 128, 0.116);\r\n");
      out.write("        border-radius: 0 10% 10% 0;\r\n");
      out.write("        width: 150px;\r\n");
      out.write("        font-size: smaller;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .detail :first-child {\r\n");
      out.write("        font-size: 40px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("\r\n");
      out.write("        padding-top: 5%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .money .detail {\r\n");
      out.write("        width: 250px !important;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("    var id = \"dfd\";\r\n");
      out.write("    function setID(newID) {\r\n");
      out.write("        id = newID;\r\n");
      out.write("        console.log(id);\r\n");
      out.write("    }\r\n");
      out.write("    function deletePro(id) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/pet-shop/removeproduct',\r\n");
      out.write("            type: 'GET',\r\n");
      out.write("            data: {\r\n");
      out.write("                id: id\r\n");
      out.write("            },\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                document.getElementById(\"row\" + id).remove();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function deletePro2(id) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/pet-shop/removeproduct',\r\n");
      out.write("            type: 'GET',\r\n");
      out.write("            data: {\r\n");
      out.write("                id: id\r\n");
      out.write("            },\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                document.getElementById(\"row\" + id).remove();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function updateFood() {\r\n");
      out.write("        console.log(id);\r\n");
      out.write("        console.log(document.getElementById(\"foodname\").value);\r\n");
      out.write("        console.log(document.getElementById(\"foodtype\").value);\r\n");
      out.write("        console.log(document.getElementById(\"foodprice\").value);\r\n");
      out.write("        console.log(document.getElementById(\"foodamount\").value);\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/pet-shop/updatefood',\r\n");
      out.write("            type: 'POST',\r\n");
      out.write("            data: {\r\n");
      out.write("                id: id,\r\n");
      out.write("                name: document.getElementById(\"foodname\").value,\r\n");
      out.write("                type: document.getElementById(\"foodtype\").value,\r\n");
      out.write("                price: document.getElementById(\"foodprice\").value,\r\n");
      out.write("                amount: document.getElementById(\"foodamount\").value\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function updatePet() {\r\n");
      out.write("        console.log(id);\r\n");
      out.write("        console.log(document.getElementById(\"petname\").value);\r\n");
      out.write("        console.log(document.getElementById(\"pettype\").value);\r\n");
      out.write("        console.log(document.getElementById(\"petprice\").value);\r\n");
      out.write("        console.log(document.getElementById(\"petamount\").value);\r\n");
      out.write("        console.log(document.getElementById(\"petcolor\").value);\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: '/pet-shop/updatepet',\r\n");
      out.write("            type: 'POST',\r\n");
      out.write("            data: {\r\n");
      out.write("                id: id,\r\n");
      out.write("                name: document.getElementById(\"petname\").value,\r\n");
      out.write("                color: document.getElementById(\"petcolor\").value,\r\n");
      out.write("                type: document.getElementById(\"pettype\").value,\r\n");
      out.write("                price: document.getElementById(\"petprice\").value,\r\n");
      out.write("                amount: document.getElementById(\"petamount\").value,\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<!-- JavaScript Libraries \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("<script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Template Javascript \r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>-->\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllFood()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr id=\"row");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td><img class=\"w-25\" src=\"img/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"\"></td>\r\n");
          out.write("                                <td><button class=\"btn btn-primary m-0\" onclick=\"setID('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" data-bs-toggle=\"modal\" data-bs-target=\"#updateFood\">Update</button></td>\r\n");
          out.write("                                <td><a class=\"btn btn-danger m-0\" onclick=\"deletePro('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">Delete</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllPet()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.petColor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td><img class=\"w-25\" src=\"img/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"\"></td>\r\n");
          out.write("                                <td><button class=\"btn btn-primary m-0\" onclick=\"setID('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" data-bs-toggle=\"modal\" data-bs-target=\"#updatePet\">Update</button></td>\r\n");
          out.write("                                <td><a class=\"btn btn-danger m-0\" onclick=\"deletePro2('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">Delete</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllOrder()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.idOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getDiscountId()==null?\"Khong ma\":\"co ma\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.orderStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td><a class=\"btn btn-primary m-0\" href=\"acceptorder?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.idOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Duyệt</a></td>\r\n");
          out.write("                                <td><a class=\"btn btn-danger m-0\" href=\"removeorder?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.idOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Hủy</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
