function isEmpty(a){
    if(a == ""){
        return 0;
    }
}

function onlySpaces(a){
    if(a.trim() !=  a && a.trim() == ""){
        return 0;
    }
}

function onlyDigits(a){
    if(!isNaN(a) && a.trim() != ""){
        return 0;
    }
}

function onlyAlphbets(a){
    if(a.match(/^[A-Za-z]+$/)){
        return 0;
    }
}

function validateEmpDetails(){
    if(isEmpty(document.emp.empNo.value)==0){
        alert("Employee number cannot be empty");
        return false;
    }
    else{
        if(onlySpaces(document.emp.empNo.value)==0){
            alert("Employee number cannot be spaces only");
            return false;
        }
        else{
            if(onlyDigits(document.emp.empNo.value)==0){
                alert("Employee number cannot be digits only");;
                return false;
            }
        }
        if(isEmpty(document.emp.empName.value)==0){
            alert("Name cannot be empty");
            return false;
        }
        else{
            if(onlySpaces(document.emp.empName.value)==0){
                alert("Name cannot be empty spaces");
                return false;
            }
            else {
                if(onlyAlphbets(document.emp.empName.value)==1){
                    alert("Name should only be alphabets");
                }
                else{
                    alert("Successful Validation");
                    return true;
                }
            }
        }

    }

}