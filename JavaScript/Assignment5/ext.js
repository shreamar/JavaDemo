function extMsg(){
    alert("Message from ext.js");
}
function dateFun(){
    var d = new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var date = d.getDate()
    alert(date+"-"+month+"-"+year);
}

function strLen(){
    str = "Levi Ackermann";
    prompt(str.length.toString());
}

function charCode(str){
    for (var i = 0; i<str.length; i++){
        document.write(str.charCodeAt(i)+" ");
    }
}

function occurances(email){
    num = email.indexOf("@");
    num1 = email.lastIndexOf("@",email.length-1);
    if(num != num1){
        document.write("Invalid Email");
    }
    else{
        document.write("Index of dot: "+email.indexOf("."));
    }
}

function arrayLength(){
    var arr = new Array(1,2,55,66, 33,22,1);
    alert(arr.length);
    for (var i = 0; i<arr.length; i++){
        document.write(arr[i]+" ");
    }
    var rra = arr.reverse();
    for (var i = 0; i<rra.length; i++){
        document.write(rra[i]+" ");
    }
}

function bigSmall(){
    var arr = new Array(1,2,55,66, 33,22,1);
    var max = arr[0];
    var min = arr[0];
    for (var i=0; i<arr.length-1; i++){
        if(arr[i+1]<arr[i]) min = arr[i+1];
        if(arr[i+1]>arr[i]) max = arr[i+1];
    }
    alert("Max: "+max+", Min: "+min);
}

function split(){
    sent = "Levi Ackermann is the strongest soldier of humanity";
    wordarr = sent.split(" ");
    wordarr.sort();
    for (var i = 0; i<wordarr.length; i++){
        document.write(wordarr[i]+" ");
    }
}
