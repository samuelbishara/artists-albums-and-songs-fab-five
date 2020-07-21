export {
    createArtistCommentRatingForm
}

import{
    addNewCommentToArtist
} from "./singleArtistFetcher.js"

import{
    createArtistSection
} from "./artistSection.js"

function createArtistCommentRatingForm(element, artistId){
 
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
        addNewCommentToArtist(comment, artistId) 
        .then(artists=>{
            createArtistSection(element, artists)
        })
})
}