$(document).ready(function(){	
	//넘기는 버튼
    $(".cardNews").hover(function(){
        $(".prev").css("visibility", "visible");
        
        $(".next").css("visibility", "visible");
    },
        
    function(){
        $(".prev").css("visibility", "hidden");
        $(".next").css("visibility", "hidden");
    })

    //카드 넘기기
    $(".prev").on("click", function(){
        $(".card li").first().appendTo(".card");
    })

    $(".next").on("click", function(){
        $(".card li").last().prependTo(".card");
    })
    
    //modal 창
    $("#modal").hide();
    
    $(".menu").on("click", function(){
    	$("#modal").show();
    })
    
    $(".close-area").on("click", function(){
    	$("#modal").hide();
    })

    //chat 수정 및 삭제
    $(document).on("click",".replyGet", function(){
    	
    	let reply = $(this).val();
    	let rno = $(this).next(".replyRno").val();
    	
    	$(".F_input").val(reply);
    	$(".F_rno").val(rno);
    	
    })
    
    $(document).on("click",".removeReply", function(){
    	
    	$("#reply_remove").submit();
    	
    })
    
    $(document).on("click",".modifyReply", function(){
    	
    	$(".chatForm").submit();
    	
    })
})