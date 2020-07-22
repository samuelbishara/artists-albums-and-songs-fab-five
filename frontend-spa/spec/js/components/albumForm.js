export {
    createAlbumForm
}

import{
    addNewAlbum
} from "./singleArtistFetcher.js"

import { 
    createAlbumSection 
} from "./albumSection.js";


function createAlbumForm(element){
    const titleInput = document.createElement('input');
    const myBr = document.createElement('br');
    titleInput.type='text';
    titleInput.placeholder = 'Enter new album';
    titleInput.classList.add('artist-label');
    element.append(titleInput);
    element.append(myBr);
    const imageInput = document.createElement('input');
    const myBr2 = document.createElement('br');
    imageInput.type='text';
    imageInput.placeholder = 'Enter image';
    imageInput.classList.add('artist-label');
    element.append(imageInput);
    element.append(myBr2);
    const recordLabelInput = document.createElement('input');
    const myBr3 = document.createElement('br');
    recordLabelInput.type='text';
    recordLabelInput.placeholder = 'Enter record label';
    recordLabelInput.classList.add('artist-label');
    element.append(recordLabelInput);
    element.append(myBr3);
    const submitButton = document.createElement('button');
    const myBr4 = document.createElement('br');
    const myBr5 = document.createElement('br');
    submitButton.innerText = "Submit New Album";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);
    element.append(myBr4);
    element.append(myBr5);

    submitButton.addEventListener('click', () => {
        const album = {
            "title": titleInput.value,
            "image": imageInput.value, 
            "recordLabel": recordLabelInput.value, 
        }
         addNewAlbum(album) 
        .then(albums=>{
            createAlbumSection(element, album)
        })
})
}