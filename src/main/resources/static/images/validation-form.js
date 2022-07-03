function validationForm() {
    let horseType = document.getElementById("type");
    let horseAge = document.getElementById("age");
    let horsePrice = document.getElementById("price");
    let IsTrue = true;

    if(!horseType.value) {
        horseType.style.border = "2px solid red";
        IsTrue = false;
    }

    if(!horseAge.value) {
        horseAge.style.border = "2px solid red";
        IsTrue = false;
    }

    if(!horsePrice.value) {
        horsePrice.style.border = "2px solid red";
        IsTrue = false;
    }
    return IsTrue;
}
