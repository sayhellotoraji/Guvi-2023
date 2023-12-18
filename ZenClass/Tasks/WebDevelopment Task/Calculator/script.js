let result = 0; // Arithmatic value for calculation
let display_result = ""; // Output value displayed

const numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"];
document.getElementById("result").value = result;

window.addEventListener("keydown", handleKeyDown);

//*************************** Clear Display ***************************** */
function clearDisplay() {
  result = 0;
  display_result = result;
  document.getElementById("result").value = display_result;
}

//***************************** BackSpace ***************************** */

function backSpace() {
  display_result = display_result.substring(0, display_result.length - 1);
  if (display_result == "") display_result = 0;
  document.getElementById("result").value = display_result;
}

//********************** KeyDown Event & Display ************************* */

function handleKeyDown(e) {
  display(e);
}

function display(e) {
  if (display_result == "0" || display_result == "00") {
    display_result = "";
  }

  if (
    lastDisplayedElement() == true &&
    currentlyEnteredElement(e) == true &&
    e.type != "keydown"
  ) {
    display_result = display_result.substring(0, display_result.length - 1);
  }

  if (e.type == "keydown") {
    if (e.key in numbers) {
      display_result += e.key;
    } else {
      alert("Only Numbers are allowed.");
      exit(); // terminates the function
      document.getElementById("result").value = display_result;
    }
  } else {
    if (e.target.id == "add") {
      display_result += "+";
    } else if (e.target.id == "subtract") {
      display_result += "-";
    } else if (e.target.id == "multiply") {
      display_result += "*";
    } else if (e.target.id == "divide") {
      display_result += "/";
    } else if (e.target.id == "modulous") {
      display_result += "%";
    } else {
      display_result += e.target.id;
    }
  }
  document.getElementById("result").value = display_result;
}

function lastDisplayedElement() {
  var len = display_result.length;
  var last_display_element = display_result[len - 1];
  return isSymbol(last_display_element);
}

function currentlyEnteredElement(e) {
  var operator = "";
  if (e.target.id == "add") {
    operator = "+";
  } else if (e.target.id == "subtract") {
    operator = "-";
  } else if (e.target.id == "multiply") {
    operator = "*";
  } else if (e.target.id == "divide") {
    operator = "/";
  } else if (e.target.id == "modulous") {
    operator = "%";
  }
  var current_entered_element = operator;

  // var current_entered_element = e.target.id;
  return isSymbol(current_entered_element);
}

function isSymbol(element) {
  if (
    element == "." ||
    element == "+" ||
    element == "-" ||
    element == "*" ||
    element == "/" ||
    element == "%"
  ) {
    return true;
  }
  return false;
}

//*************************** Calculate ******************************** */

function calculate() {
  // Regex to split numbers & symbols and store in const exp
  const exp = display_result.split(/(?<=[-+*/%])|(?=[-+*/%])/);

  var i = 2;
  while (i < exp.length) {
    var num2 = exp[i];
    if (exp[i - 1] == "+") {
      exp[0] = parseFloat(exp[0]) + parseFloat(exp[i]);
    } else if (exp[i - 1] == "-") {
      exp[0] = parseFloat(exp[0]) - parseFloat(exp[i]);
    } else if (exp[i - 1] == "*") {
      exp[0] = parseFloat(exp[0]) * parseFloat(exp[i]);
    } else if (exp[i - 1] == "/") {
      exp[0] = parseFloat(exp[0]) / parseFloat(exp[i]);
    } else if (exp[i - 1] == "%") {
      exp[0] = parseFloat(exp[0]) % parseFloat(exp[i]);
    }

    i = i + 2;
  }
  clearDisplay();
  display_result = exp[0];

  document.getElementById("result").value = display_result;
}

// New Learning - alternative to deprecated methods
// var add = new Function("x", "y", "return x+y");

// const operators = ["+", "-", "/", "%", "*", "."];
