$(document).ready(function(){




//	setInterval(() => {
//
//	    //window.scrollTo(0, -document.body.scrollHeight, "smooth")
//	    //window.scrollTop();
//	    window.scrollTo(0, document.body.scrollHeight, "smooth");
//	    
//	  },32);
	
	


})

p = 0; //초기 포커싱위치를 0으로 설정해주도록한다
function scrolling() {
    window.scroll(0,p); //스크롤바의 위치 설정
    p = p + 2; //y의 값을 점점 내리도록한다
    setTimeout("scrolling()",20); //0.1초마다 이 함수를 반복하도록설정
}
scrolling();
