let current_page = 1;


const data = [
    {
      id: "1",
      name: "Lura Senger",
      email: "Xander_Collier@yahoo.com",
    },
    {
      id: "2",
      name: "Wilburn Weber",
      email: "Bennett_Kreiger11@yahoo.com",
    },
    {
      id: "3",
      name: "Tyrique Hahn",
      email: "Juston.Altenwerth@yahoo.com",
    },
    {
      id: "4",
      name: "Lenny Bailey",
      email: "Guiseppe_Hegmann@yahoo.com",
    },
    {
      id: "5",
      name: "Vladimir Keeling",
      email: "Louisa_Walsh18@hotmail.com",
    },
    {
      id: "6",
      name: "Kellie Crona",
      email: "Chandler_Abernathy@yahoo.com",
    },
    {
      id: "7",
      name: "Carolina White",
      email: "Royal50@hotmail.com",
    },
    {
      id: "8",
      name: "Alfredo Conn",
      email: "Clarabelle34@hotmail.com",
    },
    {
      id: "9",
      name: "Stan Shanahan",
      email: "Lamar.McClure@hotmail.com",
    },
    {
      id: "10",
      name: "Marvin Fay",
      email: "Osbaldo58@hotmail.com",
    },
  ];
  

function nextPage() {
  if (current_page < 10) {
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

function display(curr_page) {
  var id = curr_page - 1;

  document.getElementById("identity").innerHTML = data[id].id;
  document.getElementById("name").innerHTML = data[id].name;
  document.getElementById("email").innerHTML = data[id].email;
}
