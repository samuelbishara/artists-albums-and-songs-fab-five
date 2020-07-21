export {
    createAlbumCommentForm
}

import{
    addNewCommentToAlbum
} from "./singleArtistFetcher.js"

import{
    createAlbumSection
} from "./albumSection.js"

function createAlbumCommentForm(element, albumId){
 
const commentInput = document.createElement('input');
    commentInput.type='text';
    commentInput.placeholder = 'Enter comment';
    commentInput.classList.add('artist-label');
    element.append(commentInput);
    const submitButton = document.createElement('button');
    submitButton.innerText = "Submit New Feedback";
    submitButton.classList.add('artist-submit');
    element.append(submitButton);

    submitButton.addEventListener('click', () => {
        const comment = commentInput.value
        addNewCommentToAlbum(comment, albumId) 
        .then(albums=>{
            createAlbumSection(element, albums)
        })
})
}