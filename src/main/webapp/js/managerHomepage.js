function viewEmployeeReimbursements() {
	let xhttp = new XMLHttpRequest();
	
	let data = "";
	data = data.concat("inputUserid=").concat(document.getElementById("inputUserid").value);
	
	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewEmployeeReimbursements.do", true);
	xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhttp.send(data);
}

function changeBursement() {
	let xhttp = new XMLHttpRequest();

	let data = "";
	data = data.concat("inputId=").concat(document.getElementById("inputId").value);
	data = data.concat("&updatedStatus=").concat(document.getElementById("updatedStatus").value);
	
	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/changeBursement.do",true);
	xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhttp.send(data);
}

function viewAllEmployees() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewAllEmployees.do");
	xhttp.send();
}

function viewAllResolvedBursements() {
	let xhttp = new XMLHttpRequest();

	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewAllResolvedBursements.do");
	xhttp.send();
}

function viewAllPendingBursements() {
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function () {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			document.getElementById("answerDiv").innerHTML = this.responseText;
		}
	};
	xhttp.open("POST", "/Project1/viewAllPendingBursements.do");
	xhttp.send();
}