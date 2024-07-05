let container = document.getElementById("container")
const API_URL = "http://localhost:8080/api/imoveis"

async function fetchImoveis() {
  let reponse = await fetch(API_URL)
  let data = await reponse.json()

  try {
    data.forEach(imovel => {
      const imovelDiv = document.createElement('div');
      const imovelId = document.createElement("h1")
      const imagemUrl = document.createElement("img")

      imovelId.innerText = data.id
      imagemUrl.src = data.imagemUrl

      imovelDiv.appendChild(imovelId)
      imovelDiv.appendChild(imagemUrl)

      container.appendChild(imovelDiv);
    });
  } catch(err) {
    console.log(err)
  }
}

fetchImoveis()