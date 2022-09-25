/**
 * 
 */



// 퇴출 선수 등록 이벤트
$("#btnSave").click(()=>{
	
	let data = {
		playerId:$("#player").val(),
		reason:$("#reason").val()
	};
	console.log(data);
	
	$.ajax("/expelled",{
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { 
			"Content-Type": "application/json"
		}
	}).done((res)=>{
		if(res.code == 1) {
			alert(res.msg);
			location.href="/expelled";
		} else {
			alert("선수가 퇴출되지 않았습니다.");
			history.back();
		}
	});
});



