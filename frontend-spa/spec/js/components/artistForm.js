export {
    createArtistForm
}

import{
    addNewArtist
} from "./singleArtistFetcher.js"

import { 
    createArtistSection 
} from "./artistSection.js"
 
import{
    createMainSection
} from "./mainSection.js"


function createArtistForm(element){
    const nameInput = document.createElement('input');
    const myBr = document.createElement('br');
    nameInput.type='text';
    nameInput.placeholder = 'Enter new artist name';
    nameInput.classList.add('artist-label');
    element.append(nameInput);
    element.append(myBr);
    const imageInput = document.createElement('input');
    const myBr2 = document.createElement('br');
    imageInput.type='text';
    imageInput.placeholder = 'Enter image';
    imageInput.classList.add('artist-label');
    element.append(imageInput);
    element.append(myBr2);
    const genreInput = document.createElement('input');
    const myBr3 = document.createElement('br');
    genreInput.type='text';
    genreInput.placeholder = 'Enter genre';
    genreInput.classList.add('artist-label');
    element.append(genreInput);
    element.append(myBr3);
    const recordLabelInput = document.createElement('input');
    const myBr4 = document.createElement('br');
    recordLabelInput.type='text';
    recordLabelInput.placeholder = 'Enter record label';
    recordLabelInput.classList.add('artist-label');
    element.append(recordLabelInput);
    element.append(myBr4);
    const descriptionInput = document.createElement('input');
    const myBr5 = document.createElement('br');
    descriptionInput.type='text';
    descriptionInput.placeholder = 'Enter description';
    descriptionInput.classList.add('artist-label');
    element.append(descriptionInput);
    element.append(myBr5);
    const submitButton = document.createElement('button');
    const myBr6 = document.createElement('br');
    const myBr7 = document.createElement('br');
    submitButton.innerText = "Submit New Artist";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);
    element.append(myBr6);
    element.append(myBr7);

    submitButton.addEventListener('click', () => {
        const artist = {
            "name": nameInput.value,
            "image": imageInput.value, 
            "genre": genreInput.value,
            "recordLabel": recordLabelInput.value,
            "description": descriptionInput.value 
        }
         addNewArtist(artist) 
        .then(artists=>{
            createArtistSection(element, artists)
        })
})
}