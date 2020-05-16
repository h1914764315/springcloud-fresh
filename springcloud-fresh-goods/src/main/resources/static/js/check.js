let login_info = new Vue({
	el: "#login_info",
	data: {
		nickName:''
	},
	mounted: function(){
		axios.get("member/check",{params:{}}).then(result =>{
			if(result.data.code == 200){
				console.info("响应为200")
				this.nickName = result.data.data.nickName;
			} else {
				this.nickName =='';
			}
		})
	}
})