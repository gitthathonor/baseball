/**
 * 
 */
 
 // 스타디움 등록 이벤트
 $("#btnSave").click(()=>{
	
	let data = {
		name:$("#name").val()
	};
	console.log(data);
	
	$.ajax("/stadium/save",{
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res)=>{
		if(res.code == 1) {
			alert(res.msg);
			location.href="/stadium";
		} else {
			alert(res.msg);
		}
	});
}); 
 
 
 
// 스타디움 삭제 함수
function deleteStadium(id, obj) {
	let tr = $(obj).parent().parent();

	let data = {
		id: id
	}

	console.log(data);
	console.log(data.id);

	$.ajax("/stadium/" + data.id + "/delete", {
		type: "DELETE",
		dataType: "json",
		data: data
	}).done((res) => {
		if (res.code == 1) {
			alert(data.id + "경기장이 삭제되었습니다.");
			location.reload();
		} else {
			alert("삭제가 실패하였습니다.");
		}
	});
}