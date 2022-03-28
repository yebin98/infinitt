<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Gowun+Dodum&display=swap" rel="stylesheet">
    
    <link rel="stylesheet" href="../resources/css/essay.css">
	<link rel="stylesheet" href="../resources/css/header.css" type="text/css">    
	<link rel="stylesheet" href="../resources/css/footer.css" type="text/css">
	<link rel="stylesheet" href="../resources/css/nav.css" type="text/css">
	
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript" src="../resources/js/uploadAjax.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-1.11.3.min.js"></script> -->
    <script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
    <!-- Bootstrap core JS-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="../resources/js/nav.js"></script>
</head>
<body>
<%@ include file="../nav.jsp" %>
<%@ include file="../H&F/header.jsp" %>
	<div class="wrap">
		<h1 class="text-center" id ="essayTitle">INFINITT Essay</h1>
		<div class="img">
			<img alt="" src="..\resources\img\light_img_infinitt_ci.png">
		</div>

        <div class="container">
			<c:if test="${login!=null}">
				<div class="btns">
	                <button><a href="http://localhost:8080/infinitt/essay/write">글쓰기</a></button>
	            </div>
			</c:if>
            <ul class="essay">
            
            	<c:forEach items="${essay}" var="essay">
	            	<li>
	            		<input type="hidden" class="bno" value="${essay.bno}">
	            		<input type="hidden" class="title${essay.bno}" value="${essay.title}">
	                    <div class="essayPic" id="essayPic${essay.bno}"></div>
	                </li>
            	</c:forEach>
            </ul>
			<form id="actionForm" action="/infinitt/essay/essay" method="get">
				<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
				<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
				<div id="dataTable_paginate" aria-label="Page navigation example">
					<ul class="pagination justify-content-center">
						<c:if test="${pageMaker.prev}">
							<li class="paginate_button page-item previous" id="dataTable_previous">
								<a href="${pageMaker.startPage-1}" class="page-link text-muted">prev</a>
							</li>
						</c:if>
						<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
							<li class="paginate_button page-item">
								<a href="${num}" class="page-link text-muted">${num}</a>
							</li>
						</c:forEach>
						<c:if test="${pageMaker.next}">
							<li class="paginate_button page-item next" id="dataTable_next">
								<a href="${pageMaker.endPage+1}" class="page-link text-muted">next</a>
							</li>
						</c:if>
					</ul>
				</div>
			</form>
        </div><!--.container-->
		<%@ include file="../H&F/footer.jsp" %> 
    </div><!--.wrap-->
<script type="text/javascript" src="../resources/js/list.js"></script>
</body>
</html>