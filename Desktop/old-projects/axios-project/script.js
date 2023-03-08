function getTodos() {

}

axios
.get("https://jsonplaceholder.typicode.com/todos?_limit=5")
.then(response => showOutput(response));
.catch(error => console.error(error));



//POST REQUEST
function addTodo() {
    axios.post("https://jsonplaceholder.typicode.com/todos", {
        title: 'New Todo',
        completed: false
    })
    .then(response => showOutput(response))
    .catch(err => console.error(error));

}

//PUT/PATCH REQUEST

function updateTodo() {
    axios.put("https://jsonplaceholder.typicode.com/todos/1", {
        title: 'New Todo',
        completed: true
    })
    .then(response => showOutput(response))
    .catch(err => console.error(error));
}

//DELETE REQUEST
function updateTodo() {
    axios
    .delete("https://jsonplaceholder.typicode.com/todos/1")
    .then(response => showOutput(response))
    .catch(error => console.error(error));
    }
   

//SIMULTANEOUS DATA
  function getData() {
      axios.all([
        axios.get("https://jsonplaceholder.typicode.com/todos")
        axios.get("https://jsonplaceholder.typicode.com/posts")
      ])
      .then(response => {
          console.log(response[0]);
          console.log(response[1]);
          showOutput(res[1]);

      })
    .catch(error => console.error(error));
    }


