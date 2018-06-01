<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="xinkong_login/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="xinkong_login/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="xinkong_login/css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎你</h3>
						<form action="#" id="f" name="f" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input id="logname" name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input id="logpass" name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2">
								<a class="act-but submit" href="javascript:;" style="color: #FFFFFF" onclick="submit()">登录</a>
							</div>
							<#--  <div class="mb2">  -->
								<#--  <a class="act-but submit" href="javascript:;" style="color: #FFFFFF">登录</a>  -->
								<#--  <input class="act-but submit" style="color: #FFFFFF" type='button' value='登录'>  -->
								<#--  <input class="act-but submit" style="color: #FFFFFF" type="submit" value="Submit">  -->
							<#--  </div>  -->
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="xinkong_login/js/TweenLite.min.js"></script>
		<script src="xinkong_login/js/EasePack.min.js"></script>
		<script src="xinkong_login/js/rAF.js"></script>
		<script src="xinkong_login/js/demo-1.js"></script>
		<div style="text-align:center;">

		<script type=text/javascript>
			function submit() {
				var submit = document.getElementById("f");
				var name = document.getElementById("logname").value;
				var pasd = document.getElementById("logpass").value;
				if (name == '') {
					alert('请输入您的账号')
					return;
	            } else if (pasd == '') {
					alert('请输入密码')
					return;
	            }
				f.action="/ind?name="+name+"&pasd="+pasd;
				f.submit();
			}
		</script>
</div>
	</body>
</html>