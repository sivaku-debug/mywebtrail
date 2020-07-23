document.getElementById("regi").addEventListener("submit",f1);

    function f1(){
    	
	var name=document.getElementById("un").value;
	if (name==''){
		event.preventDefault();
		document.getElementById("span1").innerHTML="user name should not blank";
	}
	
	var pwd=document.getElementById("cwd").value;
	if (pwd==''){
		event.preventDefault();
		document.getElementById("span2").innerHTML="user password should not blank";
	}

	}