$(document).ready(function(){
	 // bxsilder : 사진슬라이드
    $('.bxslider').bxSlider({
        auto: true,
        autoHover :true,
        pager: false,
        pause: 4000, 
        slideWidth: 1200
    });

    $(".tab_content").hide();
    $(".tabs li:first").addClass("active").show();
    $(".tab_content:first").show();
    
    
    $("ul.tabs > li").each(function(){
        if( $(this).hasClass("active") ){
            $(this).parent("ul.tabs").addClass("active");
        }
    });
    
    let job = "";
    
    $(".tabs li").click(function(){
        $(".tabs li").removeClass("active");
        $(this).addClass("active");
        $(".tab_content").hide();
        var activeTab = $(this).find("a").attr("href");
        job = $(this).find("a").text();
        console.log(job);
        $(activeTab).fadeIn();
        
        
        $(".tabs").removeClass("active");
        $(this).parent(".tabs").addClass("active");
        
        
        return false;
    });
    
    
    $(document).on("click", ".careerBtn button", function(){

    	location.href = "/infinitt/career/resume?job="+job;
    })

    //--------------------------------------------------

    $(".ftab_content").hide();
    $(".ftabs li:first").addClass("active").show();
    $(".ftab_content:first").show();
    
    
    $("ul.ftabs > li").each(function(){
        if( $(this).hasClass("active") ){
            $(this).parent("ul.ftabs").addClass("active");
        }
    });
    
    $(".ftabs li").click(function(){
        $(".ftabs li").removeClass("active");
        $(this).addClass("active");
        $(".ftab_content").hide();
        var activeTab = $(this).find("a").attr("href");
        $(activeTab).fadeIn();
        
        
        $(".ftabs").removeClass("active");
        $(this).parent(".ftabs").addClass("active");
        
        
        return false;
    });
});
