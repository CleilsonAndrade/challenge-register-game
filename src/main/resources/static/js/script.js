document.getElementById("register").addEventListener("click", function () {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const phoneNumber = document.getElementById("telephone").value;
  const groupType = document.querySelector('input[name="groupType"]:checked').value;

  const dataForm = {
    name: name,
    email: email,
    phoneNumber: phoneNumber,
    groupType: groupType
  };

  register(dataForm);
});

const url = "/players";

function register(dataForm) {
  fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(dataForm)
  })
    .then(response => response.json())
    .then(data => {
      console.log(data);
    })
    .catch(error => {
      console.error(error);
    });
}

function createList(str) {
  const words = str.split(/\s+/);

  const listItens = words.map(word => {
    const item = document.createElement('li');
    item.textContent = word;
    return item;
  });

  return listItens;
}

function addListItensElementNode(listItens, elementFather) {
  listItens.forEach(item => {
    console.log(item)
    elementFather.appendChild(item);
  });
}

function loadListRegisters() {
  fetch(url)
    .then(response => response.json())
    .then(data => {
      const listRegisters = document.getElementById("list-registers").getElementsByTagName('tbody')[0];
      listRegisters.innerHTML = "";
      data.forEach(user => {
        console.log(user)

        const listItens = createList(user.codename);

        const list = document.createElement('ul');

        addListItensElementNode(listItens, list);

        const groupType = user.groupType === "JUSTICE_LEAGUE" ? "Liga da Justiça" : "Vingadores";
        const item = document.createElement("tr");
        item.innerHTML = `
          <td>${user.name}</td>
          <td>${user.email}</td>
          <td>${user.phoneNumber}</td>
          <td>${list.outerHTML}</td>
          <td>${groupType}</td>
        `;
        listRegisters.appendChild(item);
      });
      $('#listRegistersModal').modal('show');
    })
    .catch(error => {
      console.error(error);
    });
}
