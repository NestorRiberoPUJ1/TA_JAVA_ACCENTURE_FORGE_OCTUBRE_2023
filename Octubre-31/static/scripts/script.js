


function removeButton(element) {
    console.log(element);
    element.remove();
}


const likeElement = (element) => {
    const likes = element.parentNode.lastElementChild;
    console.log(element.parentNode.querySelector("p"));
    likes.innerHTML = parseInt(likes.innerHTML) + 1;
    /* element.onclick = () => { } */
}



const searchText = () => {
    const text = document.getElementById("searchText").value;
    alert(`You are searching "${text}"`);
}
