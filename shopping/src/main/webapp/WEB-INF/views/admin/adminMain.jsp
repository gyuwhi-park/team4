<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminMain</title>

<meta charset="UTF-8">
<meta name="description" content="Ashion Template">
<meta name="keywords" content="Ashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>admin Main</title>

 <style>
  @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap');
</style>

<!-- Css Styles -->
<link rel="stylesheet" href="../resources/css/qbootstrap.min.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qfont-awesome.min.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qelegant-icons.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qjquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qmagnific-popup.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qowl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qslicknav.min.css" type="text/css">
<link rel="stylesheet" href="../resources/css/qstyle.css" type="text/css">

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
}

header {
	background-color: #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

.container2 {
	max-width: 960px;
	margin: 40px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	position: relative;
	top: -350px;
}

header h1 {
	font-size: 24px;
	color: white;
}

.profile-info {
	flex: 1;
}

.order-history {
	margin-top: 30px;
}

.table {
	width: 60%;
	position: relative;
	bottom: -200;
	margin-top: 20px;
}

table {
	width: 60%;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #ddd;
	height: 60px;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #333;
	color: #fff;
}

.logout {
	text-align: center;
	margin-top: 20px;
}

.sidebar {
	padding: 100px;
	margin: 100px;
	margin-right: 200px;
	display: inline-block;
}

</style>
</head>

<body>

	<%@ include file="header.jsp"%>
	<%@ include file="sidebar.jsp"%>
	<div id="mainContent">
	admin main dashboard
	</div>
	<%@ include file="footer.jsp"%>	
	
</body>
</html>