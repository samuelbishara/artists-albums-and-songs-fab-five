export {
    createSongCommentForm
}

import{
    addNewCommentToSong
} from "./singleArtistFetcher.js"

import{
    createSongSection
} from "./songSection.js"

function createSongCommentForm(element, songId){
 
const commentInput = document.createElement('input');
const myBr = document.createElement('br');
    commentInput.type='text';
    commentInput.placeholder = 'Enter comment';
    commentInput.classList.add('artist-label');
    element.append(commentInput);
    element.append(myBr);
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit New Feedback";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);

    submitButton.addEventListener('click', () => {
        const comment = commentInput.value
        addNewCommentToSong(comment, songId) 
        .then(songs=>{
            createSongSection(element, songs)
        })
})
}