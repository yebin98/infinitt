$(document).ready(function(){    

    $(".img").on("click", function(){

        let inputVal = $(this).children("input").val();

        $(".modal" + inputVal ).show();
        console.log(".modal" + inputVal);

    })
 });
