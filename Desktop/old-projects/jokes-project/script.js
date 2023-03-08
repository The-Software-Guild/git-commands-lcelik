const JOKES_API_URL = "https://api.goprogram.ai/inspiration";

const jokeDiv = document.getElementById("joke");
const jokeBtn = document.getElementById("jokeBtn");

jokeBtn.addEventListener("click", (event) => {
  event.preventDefault();
  console.log("clicked!");

  axios.get("https://api.goprogram.ai/inspiration").then((response) => {
    console.log(response);

    jokeDiv.innerText = response.data.quote;
  });
});
