function openWebSocket(id){
	var socket;
	if(typeof(WebSocket) == undefined){
		alert("对不起,您的浏览器不支持WebSocket通信...");
		return;
	}
	
	socket = new WebSocket("ws://127.0.0.1:80/websocket/"+id);
	
	socket.onopen = function(){
		console.info("Socket已连接...");
	}
	socket.onclose = function(){
		console.info("Socket已断开...");
	}
	socket.onerror = function(){
		console.info("Socket访问服务器失败...");
	}
	
	socket.onmessage = function(msg){
		if(msg.data == "100"){
			alert("对不起，您已经在其他地方登录，若非本人操作，请及时修改密码...");
			location.href="../../admin/loginout";
		}else {
			console.info(msg);
		}
	}
}