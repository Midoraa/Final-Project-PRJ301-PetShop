package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>PET SHOP</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.15.4/css/all.css\">\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <!--        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins&family=Roboto:wght@700&display=swap\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/flaticon/font/flaticon.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/pluscharts.css\"\r\n");
      out.write("        <script src=\"https://d3js.org/d3.v5.min.js\"></script>\r\n");
      out.write("        <script src=\"dist/pluscharts.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Topbar Start -->\r\n");
      out.write("        <div class=\"container-fluid border-bottom d-none d-lg-block\">\r\n");
      out.write("            <div class=\"row gx-0\">\r\n");
      out.write("                <div class=\"col-lg-4 text-center py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-geo-alt fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Our Office</h6>\r\n");
      out.write("                            <span>123 Street, Da Nang, Viet Nam</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center border-start border-end py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-envelope-open fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Email Us</h6>\r\n");
      out.write("                            <span>info@fpt.edu.vn</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Call Us</h6>\r\n");
      out.write("                            <span>+012 345 6789</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar Start -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm py-3 py-lg-0 px-3 px-lg-0\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand ms-lg-5\">\r\n");
      out.write("                <h1 class=\"m-0 text-uppercase text-dark\"><i class=\"bi bi-shop fs-1 text-primary me-3\"></i>Pet Shop</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                    <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                    <a href=\"service.jsp\" class=\"nav-item nav-link\">Service</a>\r\n");
      out.write("                    <a href=\"product\" class=\"nav-item nav-link\">Product</a>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                            <a href=\"testmonial.jsp\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            <a href=\"blog.jsp\" class=\"dropdown-item\">Blog Grid</a>\r\n");
      out.write("                            <a href=\"detail.jsp\" class=\"dropdown-item\">Blog Detail</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Hero Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-primary py-5 mb-5 hero-header\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("            <div class=\"row justify-content-start\">\r\n");
      out.write("                <div class=\"col-lg-8 text-center text-lg-start\">\r\n");
      out.write("                    <h1 class=\"display-1 text-uppercase text-dark mb-lg-4\">Pet Shop</h1>\r\n");
      out.write("                    <h1 class=\"text-uppercase text-white mb-lg-4\">Make Your Pets Happy</h1>\r\n");
      out.write("                    <p class=\"fs-4 text-white mb-lg-4\">Chuỗi cửa hàng thú cưng với chất lượng và uy tín hàng đầu miền Trung. Chuyên cung cấp dịch vụ và các sản phẩm đồ ăn cho thú cưng của bạn</p>\r\n");
      out.write("                    <div class=\"d-flex align-items-center justify-content-center justify-content-lg-start pt-5\">\r\n");
      out.write("                        <a href=\"\" class=\"btn btn-outline-light border-2 py-md-3 px-md-5 me-5\">Read More</a>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-play\" data-bs-toggle=\"modal\"\r\n");
      out.write("                            data-src=\"https://www.youtube.com/watch?v=xMz3P4_kYFM\" data-bs-target=\"#videoModal\">\r\n");
      out.write("                            <span></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <h5 class=\"font-weight-normal text-white m-0 ms-4 d-none d-sm-block\">Play Video</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Hero End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Video Modal Start -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"videoModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content rounded-0\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Youtube Video</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <!-- 16:9 aspect ratio -->\r\n");
      out.write("                    <div class=\"ratio ratio-16x9\">\r\n");
      out.write("                        <iframe class=\"embed-responsive-item\" src=\"\" id=\"video\" allowfullscreen allowscriptaccess=\"always\"\r\n");
      out.write("                            allow=\"autoplay\"></iframe>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Video Modal End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- About Start -->\r\n");
      out.write("    <div class=\"container-fluid py-5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row gx-5\">\r\n");
      out.write("                <div class=\"col-lg-5 mb-5 mb-lg-0\" style=\"min-height: 500px;\">\r\n");
      out.write("                    <div class=\"position-relative h-100\">\r\n");
      out.write("                        <img class=\"position-absolute w-100 h-100 rounded\" src=\"img/about.jpg\" style=\"object-fit: cover;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-7\">\r\n");
      out.write("                    <div class=\"border-start border-5 border-primary ps-5 mb-5\">\r\n");
      out.write("                        <h6 class=\"text-primary text-uppercase\">About Us</h6>\r\n");
      out.write("                        <h1 class=\"display-5 text-uppercase mb-0\">We Keep Your Pets Happy All Time</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h4 class=\"text-body mb-4\">Với đội ngũ nhân viên chuyên nghiệp của công ty, được đào tạo qua trường lớp và đặc biệt yêu nghề.</h4>\r\n");
      out.write("                    <div class=\"bg-light p-4\">\r\n");
      out.write("                        <ul class=\"nav nav-pills justify-content-between mb-3\" id=\"pills-tab\" role=\"tablist\">\r\n");
      out.write("                            <li class=\"nav-item w-50\" role=\"presentation\">\r\n");
      out.write("                                <button class=\"nav-link text-uppercase w-100 active\" id=\"pills-1-tab\" data-bs-toggle=\"pill\"\r\n");
      out.write("                                    data-bs-target=\"#pills-1\" type=\"button\" role=\"tab\" aria-controls=\"pills-1\"\r\n");
      out.write("                                    aria-selected=\"true\">Our Mission</button>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item w-50\" role=\"presentation\">\r\n");
      out.write("                                <button class=\"nav-link text-uppercase w-100\" id=\"pills-2-tab\" data-bs-toggle=\"pill\"\r\n");
      out.write("                                    data-bs-target=\"#pills-2\" type=\"button\" role=\"tab\" aria-controls=\"pills-2\"\r\n");
      out.write("                                    aria-selected=\"false\">Our Vission</button>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <div class=\"tab-content\" id=\"pills-tabContent\">\r\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"pills-1\" role=\"tabpanel\" aria-labelledby=\"pills-1-tab\">\r\n");
      out.write("                                <p class=\"mb-0\">Với sứ mệnh mang đến cho khách hàng những sản phẩm và dịch vụ tốt nhất để chăm sóc và nuôi dưỡng thú cưng của khách hàng. Chúng tôi hiểu rằng thú cưng là một phần quan trọng trong gia đình của bạn, và chúng tôi cam kết cung cấp cho bạn những sản phẩm và dịch vụ chất lượng cao nhất để đảm bảo sức khỏe và hạnh phúc của thú cưng của bạn. Chúng tôi luôn đổi mới và cập nhật sản phẩm của mình để đáp ứng nhu cầu của khách hàng và luôn sẵn sàng hỗ trợ và tư vấn cho khách hàng trong việc chăm sóc thú cưng của mình.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"pills-2\" role=\"tabpanel\" aria-labelledby=\"pills-2-tab\">\r\n");
      out.write("                                <p class=\"mb-0\">Chúng tôi muốn mang lại niềm vui và hạnh phúc cho các thú cưng và chủ nuôi của họ bằng cách cung cấp cho họ những sản phẩm và dịch vụ tốt nhất. Chúng tôi luôn đầu tư và nghiên cứu để mang đến những sản phẩm mới và độc đáo, và đồng thời cải thiện dịch vụ để đáp ứng được nhu cầu đa dạng của khách hàng</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- About End -->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- Services Start -->\r\n");
      out.write("    <div class=\"container-fluid py-5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\r\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Services</h6>\r\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Our Excellent Pet Care Services</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row g-5\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-house display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Trông giữ thú cưng</h5>\r\n");
      out.write("                            <p>Chăm sóc và trông giữ thú cưng của bạn khi bạn có việc bận</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-food display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Cho thú cưng ăn</h5>\r\n");
      out.write("                            <p>Nhận làm công thức thức ăn dành riêng cho thú cưng của bạn</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-grooming display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Cắt tỉa lông</h5>\r\n");
      out.write("                            <p>Chăm sóc ngoài hình và chải chuốt lông cho thú cưng của bạn</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-cat display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Huấn luyện thú cưng</h5>\r\n");
      out.write("                            <p>Giúp thú cưng của bạn đi vệ sinh đúng chỗ,ăn ngủ đúng giờ giấc,thực hiện theo mệnh lệnh</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-dog display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Chụp hình cho thú cưng</h5>\r\n");
      out.write("                            <p>Giúp bạn lưu giữ những hình ảnh và kỷ niệm với thú cưng của bạn</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"service-item bg-light d-flex p-4\">\r\n");
      out.write("                        <i class=\"flaticon-vaccine display-1 text-primary me-4\"></i>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <h5 class=\"text-uppercase mb-3\">Chăm sóc sức khỏe</h5>\r\n");
      out.write("                            <p>Tiêm phòng và chữa trị các loại bệnh phổ biến mà thú cưng thường mắc phải</p>\r\n");
      out.write("                            <a class=\"text-primary text-uppercase\" href=\"\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Services End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Products Start -->\r\n");
      out.write("    <div class=\"container-fluid py-5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\r\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Products</h6>\r\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Products For Your Best Friends</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"owl-carousel product-carousel\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Products End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Offer Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-offer my-5 py-5\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("            <div class=\"row gx-5 justify-content-start\">\r\n");
      out.write("                <div class=\"col-lg-7\">\r\n");
      out.write("                    <div class=\"border-start border-5 border-dark ps-5 mb-5\">\r\n");
      out.write("                        <h6 class=\"text-dark text-uppercase\">Special Offer</h6>\r\n");
      out.write("                        <h1 class=\"display-5 text-uppercase text-white mb-0\">Giảm 50% cho khách hàng đầu tiên sử dụng dịch vụ chăm sóc thú cưng</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"text-white mb-4\">Khách hàng đầu tiên sử dụng dịch vụ sẽ được giảm giá 50% trên tổng hóa đơn, mang đến cho các chủ nuôi thú cưng một cơ hội tuyệt vời để trải nghiệm và đánh giá chất lượng dịch vụ.</p>\r\n");
      out.write("                    <a href=\"\" class=\"btn btn-light py-md-3 px-md-5 me-3\">Shop Now</a>\r\n");
      out.write("                    <a href=\"\" class=\"btn btn-outline-light py-md-3 px-md-5\">Read More</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Offer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Team Start -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!-- Team End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Testimonial Start -->\r\n");
      out.write("    <div class=\"container-fluid bg-testimonial py-5\" style=\"margin: 45px 0;\">\r\n");
      out.write("        <div class=\"container py-5\">\r\n");
      out.write("            <div class=\"row justify-content-end\">\r\n");
      out.write("                <div class=\"col-lg-7\">\r\n");
      out.write("                    <div class=\"owl-carousel testimonial-carousel bg-white p-5\">\r\n");
      out.write("                        <div class=\"testimonial-item text-center\">\r\n");
      out.write("                            <div class=\"position-relative mb-4\">\r\n");
      out.write("                                <img class=\"img-fluid mx-auto\" src=\"img/testimonial-1.jpg\" alt=\"\">\r\n");
      out.write("                                <div class=\"position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                                    <i class=\"bi bi-chat-square-quote text-primary\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p>Tôi rất hài lòng với dịch vụ của cửa hàng thú cưng này. Khi đến đây, tôi luôn được đón tiếp nhiệt tình và thân thiện bởi nhân viên của cửa hàng. Họ rất chuyên nghiệp và luôn tư vấn cho tôi những sản phẩm và dịch vụ phù hợp với thú cưng của tôi</p>\r\n");
      out.write("                            <hr class=\"w-25 mx-auto\">\r\n");
      out.write("                            <h5 class=\"text-uppercase\">Nguyễn Ngọc Nhân</h5>\r\n");
      out.write("                            <span>Khách hàng</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"testimonial-item text-center\">\r\n");
      out.write("                            <div class=\"position-relative mb-4\">\r\n");
      out.write("                                <img class=\"img-fluid mx-auto\" src=\"img/testimonial-2.jpg\" alt=\"\">\r\n");
      out.write("                                <div class=\"position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                                    <i class=\"bi bi-chat-square-quote text-primary\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p> Tôi hoàn toàn tin tưởng vào sản phẩm và dịch vụ của cửa hàng này, vì chúng tôi đã cùng nhau trải qua nhiều năm và thấy rõ sự chăm sóc đặc biệt và tình cảm mà nhân viên dành cho thú cưng của tôi. Tôi chắc chắn sẽ tiếp tục đến đây để mua sắm và chăm sóc cho thú cưng của mình.</p>\r\n");
      out.write("                            <hr class=\"w-25 mx-auto\">\r\n");
      out.write("                            <h5 class=\"text-uppercase\">Nguyễn Phước Minh Hiếu</h5>\r\n");
      out.write("                            <span>Khách hàng</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Testimonial End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Blog Start -->\r\n");
      out.write("    <div class=\"container-fluid py-5\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\r\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Latest Blog</h6>\r\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Latest Articles From Our Blog Post</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row g-5\">\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"blog-item\">\r\n");
      out.write("                        <div class=\"row g-0 bg-light overflow-hidden\">\r\n");
      out.write("                            <div class=\"col-12 col-sm-5 h-100\">\r\n");
      out.write("                                <img class=\"img-fluid h-100\" src=\"img/blog-1.jpg\" style=\"object-fit: cover;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-12 col-sm-7 h-100 d-flex flex-column justify-content-center\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <div class=\"d-flex mb-3\">\r\n");
      out.write("                                        <small class=\"me-3\"><i class=\"bi bi-bookmarks me-2\"></i>PetCare</small>\r\n");
      out.write("                                        <small><i class=\"bi bi-calendar-date me-2\"></i>01 Jan, 2045</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h5 class=\"text-uppercase mb-3\">Cần làm gì khi cún bị chảy máu cam</h5>\r\n");
      out.write("                                    <p>Chảy máu cam, thường xảy ra trên cún hơn mèo, được định nghĩa là chảy máu cấp tính từ lỗ mũi hoặc vòm họng. Nguyên…</p>\r\n");
      out.write("                                    <a class=\"text-primary text-uppercase\" href=\"https://petcare.vn/can-lam-gi-khi-cun-bi-chay-mau-cam/\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6\">\r\n");
      out.write("                    <div class=\"blog-item\">\r\n");
      out.write("                        <div class=\"row g-0 bg-light overflow-hidden\">\r\n");
      out.write("                            <div class=\"col-12 col-sm-5 h-100\">\r\n");
      out.write("                                <img class=\"img-fluid h-100\" src=\"img/blog-2.jpg\" style=\"object-fit: cover;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-12 col-sm-7 h-100 d-flex flex-column justify-content-center\">\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <div class=\"d-flex mb-3\">\r\n");
      out.write("                                        <small class=\"me-3\"><i class=\"bi bi-bookmarks me-2\"></i>PetCare</small>\r\n");
      out.write("                                        <small><i class=\"bi bi-calendar-date me-2\"></i>01 Jan, 2045</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h5 class=\"text-uppercase mb-3\">Sỏi bàng quang – bệnh ở những chú chó ngoan</h5>\r\n");
      out.write("                                    <p>Hẳn một số chủ nuôi sẽ ngạc nhiên khi biết trên thú cưng cũng có bệnh lý sỏi bàng quang. Thật vậy, tuy tuổi đời…</p>\r\n");
      out.write("                                    <a class=\"text-primary text-uppercase\" href=\"https://petcare.vn/soi-bang-quang-benh-o-nhung-chu-cho-ngoan/\">Read More<i class=\"bi bi-chevron-right\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Blog End -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer Start -->\r\n");
      out.write("<div class=\"container-fluid bg-light mt-5 py-5\">\r\n");
      out.write("    <div class=\"container pt-5\">\r\n");
      out.write("        <div class=\"row g-5\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Get In Touch</h5>\r\n");
      out.write("                <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-geo-alt text-primary me-2\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-envelope-open text-primary me-2\"></i>info@example.com</p>\r\n");
      out.write("                <p class=\"mb-0\"><i class=\"bi bi-telephone text-primary me-2\"></i>+012 345 67890</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Quick Links</h5>\r\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\r\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Popular Links</h5>\r\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Meet The Team</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\r\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Newsletter</h5>\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control p-3\" placeholder=\"Your Email\">\r\n");
      out.write("                        <button class=\"btn btn-primary\">Sign Up</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <h6 class=\"text-uppercase mt-4 mb-3\">Follow Us</h6>\r\n");
      out.write("                <div class=\"d-flex\">\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-twitter\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-facebook\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-linkedin\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square\" href=\"#\"><i class=\"bi bi-instagram\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 text-center text-body\">\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Terms & Conditions</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Customer Support</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Payments</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Help</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">FAQs</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container-fluid bg-dark text-white-50 py-4\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row g-5\">\r\n");
      out.write("            <div class=\"col-md-6 text-center text-md-start\">\r\n");
      out.write("                <p class=\"mb-md-0\">&copy; <a class=\"text-white\" href=\"#\">Your Site Name</a>. All Rights Reserved.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Back to Top -->\r\n");
      out.write("<a href=\"#\" class=\"btn btn-primary py-3 fs-4 back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript Libraries -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("<script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Template Javascript -->\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("                </body>\r\n");
      out.write("                \r\n");
      out.write("                </html>\r\n");
      out.write("    ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"login.jsp\" class=\"nav-item nav-link nav-contact bg-primary text-white px-5 ms-lg-5\">Log in <i class=\"bi bi-arrow-right\"></i></a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"nav-item dropdown\">\r\n");
        out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle bg-primary text-white px-5 ms-lg-5\" data-bs-toggle=\"dropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                            <div class=\"dropdown-menu m-0\">\r\n");
        out.write("                                <a href=\"inforUser.jsp\" class=\"dropdown-item\">Your information</a>\r\n");
        out.write("                                ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                    <a href=\"cart.jsp\" class=\"dropdown-item\">Your cart</a>\r\n");
        out.write("                                    <a href=\"getorderhistory\" class=\"dropdown-item\">History order</a>\r\n");
        out.write("                                    <a href=\"logout\" class=\"dropdown-item text-danger\">Log out</a>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userRole.equals('admin')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <a href=\"admin.jsp\" class=\"dropdown-item\">Admin</a>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("food");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listFood}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <div class=\"pb-5\">\r\n");
          out.write("                    <div class=\"product-item position-relative bg-light d-flex flex-column text-center\">\r\n");
          out.write("                        <img class=\"img-fluid mb-4\" src=\"img/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"\">\r\n");
          out.write("                        <h6 class=\"text-uppercase\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                        <h5 class=\"text-primary mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.getPriceString()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                        <div class=\"btn-action d-flex justify-content-center\">\r\n");
          out.write("                            <a class=\"btn btn-primary py-2 px-3\" href=\"getfooddetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"bi bi-cart\"></i></a>\r\n");
          out.write("                            <a class=\"btn btn-primary py-2 px-3\" href=\"getfooddetail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${food.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"bi bi-eye\"></i></a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                </div>\r\n");
          out.write("                ");
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
}
