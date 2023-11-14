<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.team4.*"%>
<%@page import="com.team4.domain.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet" href="cartPage.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
crossorigin="anonymous"></script>
</head>
<body>
	<!-- 장바구니 DB값 불러오기 -->
	<%-- <table>
		<tbody>
	
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			String driver 	= "com.mysql.cj.jdbc.Driver";
			String url 		= "jdbc:mysql://localhost:3306/test";
			String user 	= "scott";
			String pass 	= "tiger";
			
			conn = DriverManager.getConnection(url, user, pass);
			
			pstmt = conn.prepareStatement("select * from cart");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
	%>
		<tr>
			<td><%= rs.getString("cart_idx") %></td>
			<td><%= rs.getString("cart_count") %></td>
			<td><%= rs.getString("cart_option") %></td>
			<td><%= rs.getString("product_idx") %></td>
			<td><%= rs.getString("user_idx") %></td>
		</tr>
	<%
			}
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} 
	
	%>
	</tbody>
</table>  --%>
	
	
	<!-- header 영역 -->
	<!-- header end -->


	
	
	
	<!-- 장바구니 html -->
	
	<div class="wrapper">
	<div class="wrap">
		<div class="top_gnb_area">
			<ul class="list">
				<c:if test = "${user == null}">	<!-- 로그인 x -->	
					<li >
						<a href="user/saveUser.do">로그인</a>
					</li>
					<li>
						<a href="user/register.do">회원가입</a>
					</li>
				</c:if>
				<c:if test="${user != null }">	<!-- 로그인 o -->		
					<c:if test="${user.admin == 1 }">	<!-- 관리자 계정 -->
						<li><a href="/admin/main">관리자 페이지</a></li>
					</c:if>							
					<li>
						<a id="gnb_logout_button">로그아웃</a>
					</li>
					<li>
						마이룸
					</li>
					<li>
						<a href="/cart/${cart.cartPage}">장바구니</a>
					</li>
				</c:if>				
				<li>
					고객센터
				</li>			
			</ul>			
		</div>
		<div class="top_area">
			<!-- 로고영역 -->
			<div class="logo_area">
				<!-- <a href="/main"><img src="/resources/img/mLogo.png"></a> 브랜드 로고 -->
			</div>
			<div class="search_area">
                	<div class="search_wrap">
                		<form id="searchForm" action="/search" method="get">
                			<div class="search_input">
                				<select name="type">
                					<option value="T">상품명</option>
                					<option value="A">이름</option>
                				</select>
                				<input type="text" name="keyword" value="<c:out value="${pageMaker.cri.keyword}"/>">
                    			<button class='btn search_btn'>검 색</button>               				
                			</div>
                		</form>
                	</div>
			</div>
			<%-- <div class="login_area">
			
				<!-- 로그인 하지 않은 상태 -->
				<c:if test = "${user_id == null }">
					<div class="login_button"><a href="/user/register.do">로그인</a></div>
					<span><a href="/user/saveUser.do">회원가입</a></span>			
				</c:if>				
				
				<!-- 로그인한 상태 -->
				<c:if test="${ user_id != null }">
					<div class="login_success_area">
						<span>회원 : ${user.user_name}</span>
						<span>충전금액 : <fmt:formatNumber value="${member.money }" pattern="\#,###.##"/></span>
						<span>포인트 : <fmt:formatNumber value="${member.point }" pattern="#,###" /></span>
						<a href="/member/logout.do">로그아웃</a>
					</div>
				</c:if>
				
			</div> --%>
			<div class="clearfix"></div>			
		</div>
		<div id="subjectTable">
	<table class="subject_table">
		<caption>표 제목 부분</caption>
			<tbody>
				<tr>
				<th><input type="checkbox" id="cbx_chkAll" /></th>
						<th class="td_width_1">상품</th>
						<th class="td_width_2">상품명</th>
						<th class="td_width_3">가격</th>
						<th class="td_width_3">수량</th>
						<th class="td_width_3">합계</th>
						<th class="td_width_3">삭제</th>
				</tr>
			</tbody>
		</table>
	<table class="cart_table">
				<!-- c:forEach items="${cartList}" var="cart"  -->
					<caption>표 내용 부분</caption>
					
					<c:forEach items="${cartList}" var="cart">
						<tr>
							<td>${cartList.cart_idx}</td>
							<td>${cartList.cart_count}</td>
							<td>${cartList.cart_option}</td>
							<td>${cartList.product_idx}</td>
							<td>${cartList.user_idx}</td>
						</tr>
					</c:forEach>
					
						<!-- 체크박스 전체 체크 html -->
		<tbody>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
		</tbody>
	
	<!-- 체크박스 html end -->
	
					
				</table>
</div>
		
		<!-- DB로부터 전달받은 정보 출력 -->
		<div class="content_area">
			<div class="content_subject"><span>장바구니</span></div>
			<!-- 장바구니 리스트 -->
			<div class="content_middle_section"></div>
			<!-- 장바구니 가격 합계 -->
			<!-- cartInfo -->
			<div class="content_totalCount_section">
				
				<table class="subject_table">
					<caption>표 제목 부분</caption>
					<tbody>
						<tr>
						<th><input type="checkbox" id="cbx_chkAll" /></th>
							<th class="td_width_1">상품</th>
							<th class="td_width_2">상품명</th>
							<th class="td_width_3">가격</th>
							<th class="td_width_3">수량</th>
							<th class="td_width_3">합계</th>
							<th class="td_width_3">삭제</th>
						</tr>
					</tbody>
				</table>
				<table class="cart_table">
				<!-- c:forEach items="${cartList}" var="cart"  -->
					<caption>표 내용 부분</caption>
					
					<c:forEach items="${cartList}" var="cart">
						<tr>
							<td>${cartList.cart_idx}</td>
							<td>${cartList.cart_count}</td>
							<td>${cartList.cart_option}</td>
							<td>${cartList.product_idx}</td>
							<td>${cartList.user_idx}</td>
						</tr>
					</c:forEach>
					
						<!-- 체크박스 전체 체크 html -->
		<tbody>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chk" id="chk"></td>
			</tr>
		</tbody>
	
	<!-- 체크박스 html end -->
	
					<tbody>
						<c:forEach items="${cartList}" var="cart"> <!-- 장바구니 -->
						<c:forEach items="${productList}" var="product"> <!-- 제품 -->
						<c:forEach items="${purchaseList}" var="purchase"> <!-- 총 금액 -->
							<tr>
								<%-- <td class="td_width_1">${img.img}</td> --%> <!-- 상품이미지 -->
								<td class="product_name">${product.product_name}</td> <!-- 상품명 productList -->
								<td class="product_price">${product.product_price}</td> <!-- 가격 productList --> 
								<td class="cart_count">${cart.cart_count}</td> <!-- 수량 cartList -->
								<td class="td_width_4 table_text_align_center"> <!-- 총 금액 purchaseList -->
									<del>판매가 : <fmt:formatNumber value="${purchase.purchase_price}" pattern="#,### 원" /></del><br>
								</td>
								<td class="td_width_4 table_text_align_center">
									<div class="table_text_align_center quantity_div">
										<input type="text" value="${product.product_count}" class="quantity_input">	
										<button class="quantity_btn plus_btn">+</button>
										<button class="quantity_btn minus_btn">-</button>
									</div>
									<a class="quantity_modify_btn">변경</a>
								</td>
								<td class="td_width_4 table_text_align_center">
									<fmt:formatNumber value="${product.product_price * product.product_count}" pattern="#,### 원" />
								</td>
								<td class="td_width_4 table_text_align_center delete_btn"><button>삭제</button></td>
							</tr>
						</c:forEach>
						</c:forEach>
						</c:forEach>
					</tbody>
				</table>
				<table class="list_table">
				</table>
			</div>
			<!-- 가격 종합 -->
			<div class="content_total_section">
				<div class="total_wrap">
					<table>
						<tr>
							<td>
								<table>
									<tr>
										<td>총 상품 가격</td>
										<td>
											<span class="totalPrice_span">70000</span> 원
										</td>
									</tr>
									<tr>
										<td>배송비</td>
										<td>
											<span class="delivery_price">3000</span>원
										</td>
									</tr>									
									<tr>
										<td>총 주문 상품수</td>
										<td><span class="totalKind_span"></span>종 <span class="totalCount_span"></span>권</td>
									</tr>
								</table>
							</td>
							<td>
								<table>
									<tr>
										<td></td>
										<td></td>
									</tr>
								</table>							
							</td>
						</tr>
					</table>
					<div class="boundary_div">구분선</div>
					<table>
						<tr>
							<td>
								<table>
									<tbody>
										<tr>
											<td>
												<strong>총 결제 예상 금액</strong>
											</td>
											<td>
												<span class="finalTotalPrice_span">70000</span> 원
											</td>
										</tr>
									</tbody>
								</table>
							</td>
							<td>
								<table>
									<tbody>
										<tr>
											<td>
												<strong>총 적립 예상 마일리지</strong>
											
											</td>
											<td>
												<span class="totalPoint_span">70000</span> 원
											</td>
										</tr>
									</tbody>
								</table>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<!-- 구매 버튼 영역 -->
			<div class="content_btn_section">
				<form action="inquire">
				<a>주문하기</a>
				</form>
			</div>

		</div>
	</div>
</div>		
		
		<!-- footer 영역 -->
		
		
		
		<!-- footer end -->
	
	

	<!-- 장바구니 html end -->
	
	<!-- 장바구니 css  -->
	
	<style>
	
*{
	margin: 0;
	padding:0;
}

a{
	text-decoration: none;
}
/* 화면 전체 렙 */
.wrapper{
	width: 100%;
}
/* content 랩 */
.wrap{
	width : 1080px;
	margin: auto;
}
/* 홈페이지 기능 네비 */ 
.top_gnb_area{
	width: 100%;
    height: 50px;
    background-color: #f0f0f1;
    position:relative;    
}
.top_gnb_area .list{
	position: absolute;
    top: 0px;
    right: 0;
    
}
.top_gnb_area .list li{
	list-style: none;	
    float : left;
    padding: 13px 15px 0 10px;
    font-weight: 900;
    cursor: pointer;
}
/* 로고, 검색, 로그인 */
.top_area{
	width: 100%;
    height: 150px;
    /* background-color: #f7f0b9; */
}
/* 로고 영역 */
.logo_area{
	width: 25%;
	height: 100%;
	float:left;
}
.logo_area img{
	width: 100%;
    height: 100%;
}

/* 검색 박스 영역 */
.search_area{
	width: 50%;
	height: 100%;
	float:left;	
}
.search_wrap{
	width: 100%;
    height: 100%;
}
#searchForm{
	width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}
.search_input{
    display: flex;
    height: 30%;
    width: 80%;	
}
.search_input select{
	width: 20%;
    text-align: center;
    font-size: 15px;	
}
.search_input input{
    margin-left: 10px;
    width: 57%;	
    font-size: 18px;
    padding-left: 2%;
}
.search_btn{
	margin-left: 10px;
    width: 17%;
    border-radius: 14px;
    font-size: 17px;
    font-weight: 600;	
}	


/* 로그인 버튼 영역 */
.login_area{
	width: 25%;
	height: 100%;
	display: inline-block;	
	text-align: center;		
}
.login_button{
	height: 50%;
    background-color: #D4DFE6;
    margin-top: 30px;
    line-height: 77px;
    font-size: 40px;
    font-weight: 900;
    border-radius: 10px;
    cursor: pointer;	
}
.login_area>span{
	margin-top: 10px;
    font-weight: 900;
    display: inline-block;
}
.login_button{
	height : 50%;
	background-color: #D4DFE6;
	margin-top:30px;
}

/* 제품 목록 네비 */
.navi_bar_area{
	width: 100%;
    height: 70px;
    background-color: #7696fd;
}

/* 홈페이지 메인 제품 목록  */
.content_area{
	width: 100%;
    min-height: 1000px;
}




/* 로그인 성공 영역 */
.login_success_area{
	height: 62%;
    width: 80%;
    border: 2px solid #7474ad;
    border-radius: 15px;
    margin: 5% auto;
    padding-top: 5%;
}
.login_success_area>a{
    font-size: 15px;
    font-weight: 900;
    display: inline-block;
    margin-top: 5px;
    background: #e1e5e8;
    width: 82px;
    height: 22px;
    line-height: 22px;
    border-radius: 25px;
    color: #606267;    
}
.login_success_area>span{
	display : block;
	text-align: left;
    margin-left: 10%;
}

/* 검색결과 없음 */
.table_empty{
	height: 50px;
    text-align: center;
    margin: 200px 0 215px 0px;
    font-size: 25px;
}

/* 필터정보 */
.search_filter {
    width: 85%;
    margin: auto;
	margin-top: 30px;
    margin-bottom: 50px;    
} 
.filter_button_wrap {
    width: 100%;
}

.filter_button_wrap button {
    width: 50%;
} 
.filter_button{
	background-color: #04AA6D;
	border: 1px solid green;
	color: white;
	padding: 10px 24px;
	cursor: pointer;
	float: left;
} 
.filter_button_wrap:after {
    content: "";
    clear: both;
    display: table;
}  	
.filter_button_wrap button:not(:last-child) {
    border-right: none;
} 
.filter_button:hover {
    background-color: #3e8e41;
}
.filter_active{
	background-color: #045d3c;
}
.filter_content{
	padding:20px 50px 20px 50px;
	border: 1px solid gray;
}
.filter_content a:not(:first-child){
	margin-left: 10px;
}
.filter_a{
	display: block;
}

.filter_b{
	display: none;
}



/* footer navai 영역 */
.footer_nav{
	width:100%;
	height:50px;
}
.footer_nav_container{
	width: 100%;
	height: 100%;
	background-color:#8EC0E4;
}
.footer_nav_container>ul{
	font-weight : bold;
	float:left;
	list-style:none;
	position:relative;
	padding-top:10px;
	line-height: 27px;
	font-family: dotum;
	margin-left: 10px;
}
.footer_nav_container>ul>li{
	display:inline;
	width: 45px;
	height: 19px;
	padding: 10px 9px 0 10px;
}
.footer_nav_container>ul>span{
	margin: 0 4px;
}
/* footer 영역 */
.footer{
	width:100%;
	height:130px;
	background-color:#D4DFE6;
	padding-bottom : 50px;
}
.footer_container{
	width: 100%;
	height: 100%;
	margin: auto;
}
.footer_left>img {
	width: 150%;
    height: 130px;
    margin-left: -20px;
    margin-top: -12px;
}
.footer_left{
	float :left;
	width: 170px;
	margin-left: 20px;
	margin-top : 30px;
	
}
.footer_right{
	float :left;
	width: 680px;
	margin-left: 70px;
	margin-top : 30px;
}


/* float 속성 해제 */
.clearfix{
	clear: both;
}

	 table{
	 	border-collapse: collapse;
	 	width: 100%;
	 }
	 .table_text_align_center{
				text-align: center;
	 }	
	 caption{
	    visibility: hidden;
	    width: 0;
	    height: 0;
	    font-size: 0;
	    line-height: 0;
	    overflow: hidden; 
	 }	  

	 .content_subject{
		height: 110px;
	    line-height: 110px;
	    background-color: #5080bd;
	    margin-bottom: 60px; 
	 
	 }
		 .content_subject span{ 
		    padding-left: 30 px;
		    display: inline-block;
		    color: white;
		    font-size: 50px;
		    font-weight: bolder; 
		 }
	 
	 .content_totalCount_section{
	 	margin-bottom: 12px;
	 }
	 .content_btn_section{
	 	margin-top: 20px;
	 	text-align: right;
	 }
	 	.content_btn_section a{
	    color: #fefeff;
	    background-color: #365fdd;
	    min-width: 125px;
	    padding: 17px 25px;
	    display: inline-block;
	    height: 39px;
	    font-size: 23px;
	    font-weight: bold;
	    text-align: center;
	    margin-right: 14px;
	    line-height: 39px; 	
	 	}
	 

	 .subject_table{
		font-size: 14px;
	    line-height: 20px;
	    width: 100%;
	    text-align: center; 	
	 }

		 th{
		text-align: center;
	    color: #333;
	    border-bottom: 1px solid #e7e7e7;
	    border-top: 1px solid #3084d9;
	    background: #f4f9fd;
	    padding: 2px 0;	 
		 }
		.td_width_1{
			width: 5%;
		}	 	 	 
		.td_width_2{
			width: 10%;
		}	 	 
		.td_width_3{
			width: 25%;
		}	 
		.td_width_4{
			width: 15%;
		}	
		.cart_table{
			font-size: 14px;
			line-height: 20px;
		}  
			.cart_table tr{
				height: 110px;
			}
			.price_td{
				padding-left: 5px;
			}
				.red_color{
					color : red;
				}
				.green_color{
					color : green;
				}
			.cart_table td{
				border-bottom: 1px solid #e7e7e7;
			}
			.quantity_div{
				position: relative;
			    width: 42px;
			    height: 25px;
			    text-align: left;
			    margin: 5px auto;		
			}
			.quantity_input{
				position: absolute;
				width: 27px;
			    height: 23px;
			    text-align: center;
			    border: 1px solid #c6c6c6;
			    border-right: 0px;
			    line-height: 19px;
			    font-size: 12px;
			    color: #4c4848;	
			    left: 0;
			}
			.quantity_btn{
				position: absolute;
			    border: 1px solid #aaa;
			    color: #3a60df;
			    width: 14px;
			    height: 13px;
			    padding: 0px;
			    background-color: #fff;
			    font-weight: bold;
			    font-size: 7px;
			    line-height: 6px;
			    vertical-align: middle;	
			}
			.plus_btn{
				top: 0;
				right: 0
			}
			.minus_btn{
				bottom: 0;
				right: 0
			}		
			.quantity_modify_btn{
				border: 1px solid #d0d0d0;
			    height: 13px;
			    line-height: 13px;
			    background-color: #fff;
			    text-align: center;
			    width: 28px;
			    display: inline-block;
			    padding: 3px 6px 2px;
			    margin-top: 3px;		
			}
			.table_text_align_center{
				text-align: center;
			}
			.delete_btn{
				width: 40px;		
			}
		
	.content_total_section{
		    background-color: rgb(227, 237, 247);
	}		
		.total_wrap{
			width: 80%;
		    margin: auto;
		    padding: 10px 0 10px 0;	
		}
			.total_wrap td{
				width : 50%;
			}
			.finalTotalPrice_span{
				color: #854A72;
				font-size: 17px;
				font-weight: bold;
			}
			.totalPoint_span{
				font-size: 17px;
				font-weight: bold;		
			}
			.boundary_div{
				font-size: 0;
			    border: 1px dotted #d1c7c7;
			    margin: 5px 0 5px 0;		
			}
	</style>

	<!-- 장바구니 css end  -->
	
	
	
	<!-- js -->



<script type="text/javascript">
// 체크박스 이벤트
$(document).ready(function() {
	$("#cbx_chkAll").click(function() {
		if($("#cbx_chkAll").is(":checked")) $("input[name=chk]").prop("checked", true);
		else $("input[name=chk]").prop("checked", false);
	});
	
	$("input[name=chk]").click(function() {
		var total = $("input[name=chk]").length;
		var checked = $("input[name=chk]:checked").length;
		
		if(total != checked) $("#cbx_chkAll").prop("checked", false);
		else $("#cbx_chkAll").prop("checked", true); 
	});
});

/* 체크박스 end  */





/* 상품 페이지 */



</script>




</body>
</html>