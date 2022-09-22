<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>경기장</th>
        <th>개장일</th>
        <th>수정</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="stadium" items="${stadiumList}">
      <tr>
        <td>${stadium.id}</td>
        <td>${stadium.name}</td>
        <td>${stadium.createdAt}</td>
        <td><button id="btnUpdate" class="btn btn-warning">수정</button></td>
      	<td><i onclick="deleteStadium(${stadium.id},this)" class="fa-solid fa-trash"></i></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>


<script>
	function deleteStadium(id, obj) {
		let tr = $(obj).parent().parent();
		
		let data = {
				id : id
		}
		
		console.log(data);
		console.log(data.id);
		
		$.ajax("/stadium/"+data.id+"/delete",{
			type: "DELETE",
			dataType: "json",
			data:data
		}).done((res)=>{
			if(res.code == 1) {
				alert(data.id+"경기장이 삭제되었습니다.");
				location.reload();
			} else {
				alert("삭제가 실패하였습니다.");
			}
		});
	}
</script>

<%@ include file="../layout/footer.jsp" %>