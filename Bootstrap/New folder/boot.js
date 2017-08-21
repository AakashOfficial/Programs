$(document).ready(function(){  
      $('#myCarousel').carousel({      interval:6000    });
 
 $('#myCarousel').bind('mousewheel DOMMouseScroll', function(e){ 
    if(e.originalEvent.wheelDelta > 0 || e.originalEvent.detail < 0) {   
	$(this).carousel('prev');                                }   
	else{            $(this).carousel('next');                    }    });
 
 $("#myCarousel").on("touchstart", function(event){  
    var yClick = event.originalEvent.touches[0].pageY;      
 
 $(this).one("touchmove", function(event){      
      var yMove = event.originalEvent.touches[0].pageY;    
 	  if( Math.floor(yClick - yMove) > 1 ){        
     	  $(".carousel").carousel('next');        }      
		  else if( Math.floor(yClick - yMove) < -1 )
		    {       
       		  $(".carousel").carousel('prev');     
   		    }   
		});  
 
 $(".carousel").on("touchend", function(){            $(this).off("touchmove");