export {
    createSongForm
}

import{
    addNewSong
} from "./singleArtistFetcher.js"

import { 
    createSongSection 
} from "./songSection.js";


function createSongForm(element){
    const titleInput = document.createElement('input');
    const myBr = document.createElement('br');
    titleInput.type='text';
    titleInput.placeholder = 'Enter new song title';
    titleInput.classList.add('artist-label');
    element.append(titleInput);
    element.append(myBr);
    const linkInput = document.createElement('input');
    const myBr2 = document.createElement('br');
    linkInput.type='text';
    linkInput.placeholder = 'Enter link';
    linkInput.classList.add('artist-label');
    element.append(linkInput);
    element.append(myBr2);
    const durationInput = document.createElement('input');
    const myBr3 = document.createElement('br');
    durationInput.type='text';
    durationInput.placeholder = 'Enter duration';
    durationInput.classList.add('artist-label');
    element.append(durationInput);
    element.append(myBr3);
    const submitButton = document.createElement('button');
    const myBr4 = document.createElement('br');
    const myBr5 = document.createElement('br');
    submitButton.innerText = "Submit New Song";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);
    element.append(myBr4);
    element.append(myBr5);

    submitButton.addEventListener('click', () => {
        const song = {
            "title": titleInput.value,
            "link": linkInput.value, 
            "duration": durationInput.value,
        }
         addNewSong(song) 
        .then(songs=>{
            createSongSection(element, songs)
        })
})
}