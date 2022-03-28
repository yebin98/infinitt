$(document).ready(function(){
	let actionForm = $("#actionForm");
	//검색버튼을 클릭하면
	$("input[type='submit']").on("click", function(e){
		e.preventDefault();
		//pageNum의 값을 1로 설정
		actionForm.find("input[name='pageNum']").val("1");
		actionForm.submit();
	})
	
	// 페이지 번호를 클릭하면
	$(".paginate_button a").on("click", function(e){
		e.preventDefault();﻿
		actionForm.find("input[name='pageNum']").val($(this).attr("href"));
		actionForm.submit();	
	})
})	