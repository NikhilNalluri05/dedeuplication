<%-- 
    Document   : newjsp
    Created on : 10 Mar, 2016, 2:41:33 AM
    Author     : Devaa
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>





<html lang="en">
<head>
<title>About</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/CabinSketch_700.font.js"></script>
<script type="text/javascript" src="js/EB_Garamond_400.font.js"></script>
<!-- [if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<style type="text/css">
.bg {behavior:url(js/PIE.htc)}
</style>
<![endif]-->
<!-- [if lt IE 7]>
<div style='clear:both;text-align:center;position:relative'>
	<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0" alt="" /></a>
</div>
<![endif]-->
</head>
<body id="page1">
<div class="main">
<!-- header -->
	<header>
		<div class="wrapper">
			<nav>
				<ul id="menu">
					<li id="menu_active"><a href="index.jsp"><span>H</span>ome</a></li>
					<li><a href="Adminlogin.jsp"><span>A</span>dmin</a></li>
					<li><a href="UploadLogin.jsp"><span>U</span>pload</a></li>
					<li><a href="Privacy.html"><span>D</span>ownload</a></li>
					<li><a href="Contacts.html"><span>C</span>ontacts</a></li>
				</ul>
			</nav>
		</div>
		<h1><a href="index.html" id="logo">deduplication </a></h1>
	</header><div class="ic"></div>
<!-- / header -->
<!-- content -->
	<section id="content">
		<div class="wrapper">
			<article class="col1">
				<h2>User Login</h2>
				<div class="pad_left1 pad_bot1">
					<div id="slider">
                                            
                                            
                                            <form class="form" method="post" action="UploadLogin"  onsubmit="" >	
                                                
						<div id="for_img">
							<div id="nivo_slider">
								
                                                            
                                                             
    
                                                            <br><br>
                                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="text" required title="Username required" name="username" placeholder="Username"  id="username"/>
     <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="password" required title="Password required" name="password" placeholder="Password" id="password"/>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <br><br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button>Login</button>

                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
							</div>
						</div>
                                            </form>
                                            
                                            
                                            
					</div>
					<div class="pad">
						
					</div>
				</div>
				<h2><span>Our Solutions</span></h2>
				<div class="pad_left1">
					<div class="pad_left1">
						<div class="wrapper pad_top1">
							<div class="col3">
								
							</div>
							
						</div>
						<div class="wrapper">
							<div class="col3">
							
						</div>
					</div>
				</div>
    		</article>
			<article class="col2">
				<h3>Latest Works</h3>
				<ul class="ul_works">
					
				</ul>
				
				<div class="tweets">
					
				</div>
    		</article>
		</div>
	</section>
<!-- / content -->
<!-- footer -->
	<footer>
		<div class="wrapper">
		
			
			
		</div>
		<article class="privacy">
			
		</article>
		<a href="index.html" class="footer_logo">Pantech<span>Ed</span>.com</a>
	</footer>
<!-- / footer -->
</div>
<script type="text/javascript">Cufon.now();</script>
<script type="text/javascript">
	$(window).load(function() {
	$('#nivo_slider').nivoSlider({
		effect:'fold', //Specify sets like: 'fold,fade,sliceDown, sliceDownLeft, sliceUp, sliceUpLeft, sliceUpDown, sliceUpDownLeft'
		slices:7,
		animSpeed:500,
		pauseTime:6000,
		startSlide:0, //Set starting Slide (0 index)
		directionNav:true, //Next & Prev
		directionNavHide:false, //Only show on hover
		controlNav:true, //1,2,3...
		controlNavThumbs:false, //Use thumbnails for Control Nav
		controlNavThumbsFromRel:false, //Use image rel for thumbs
		controlNavThumbsSearch: '.jpg', //Replace this with...
		controlNavThumbsReplace: '_thumb.jpg', //...this in thumb Image src
		keyboardNav:true, //Use left & right arrows
		pauseOnHover:true, //Stop animation while hovering
		manualAdvance:false, //Force manual transitions
		captionOpacity:1, //Universal caption opacity
		beforeChange:function(){},
		afterChange:function(){},
		slideshowEnd:function(){} //Triggers after all slides have been shown
	});
});
</script>
</body>
</html>