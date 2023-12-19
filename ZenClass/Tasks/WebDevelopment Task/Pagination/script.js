function nextPage() {
  if (current_page < 100) {
    current_page += 1;
  }
  display(current_page);
}

function previousPage() {
  if (current_page > 1) {
    current_page -= 1;
  }
  display(current_page);
}

function firstPage() {
  current_page = 1;
  display(current_page);
}

function lastPage() {
  current_page = 10;
  display(current_page);
}

async function getapi(url) {
  const response = await fetch(url);
  var fetched_data = await response.json();
  data = fetched_data;
}

function display(curr_page) {
  var id = curr_page - 1;

  // while(data==undefined){
  //   getapi(url);
  // }
  document.getElementById("identity").innerHTML = data[id].id;
  document.getElementById("name").innerHTML = data[id].name;
  document.getElementById("email").innerHTML = data[id].email;
}

let current_page = 1;

const url =
  "https://raw.githubusercontent.com/Rajavasanthan/jsondata/master/pagenation.json";

let data;
getapi(url);
getapi(url);


