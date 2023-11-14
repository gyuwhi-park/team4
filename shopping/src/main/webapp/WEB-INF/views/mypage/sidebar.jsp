<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <section class="shop spad">
    <div class="container">
      <div class="row">
        <div class="col-lg-3 col-md-3">
          <div class="shop__sidebar">
            <div class="sidebar__categories">
              <div class="section-title">
                <h4>마이페이지</h4>
              </div>
              <div class="categories__accordion">
                <div class="accordion" id="accordionExample">

                  <div class="card">
                    <div class="card-heading active">
                      <a data-toggle="collapse" data-target="#collapseOne">주문관리</a>
                    </div>
                    <div id="collapseOne" class="collapse show" data-parent="#accordionExample">
                      <div class="card-body">
                        <ul>
                          <li><a href="orderlist">주문조회</a></li>
                          <li><a href="wishlist">위시리스트</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                     <div class="card">
                    <div class="card-heading">
                      <a data-toggle="collapse" data-target="#collapseThree">활동관리</a>
                    </div>
                    <div id="collapseThree" class="collapse" data-parent="#accordionExample">
                      <div class="card-body">
                        <ul>
                          <li><a href="mypage_inquire">1:1 문의</a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                  <div class="card">
                    <div class="card-heading">
                      <a data-toggle="collapse" data-target="#collapseThree">정보관리</a>
                    </div>
                    <div id="collapseThree" class="collapse" data-parent="#accordionExample">
                      <div class="card-body">
                        <ul>
                          <li><a href="resign">회원탈퇴</a></li>

                        </ul>
                      </div>
                    </div>
                  </div>

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
	<script type="text/javascript" src="../../../resources/js/J/jquery.slicknav.js"></script>
	<script src="../../../resources/js/J/main.js"></script>
	<script src="../../../resources/js/J/mixitup.min.js"></script>
	<script src="../../../resources/js/J/my.js"></script>
</body>
</html>