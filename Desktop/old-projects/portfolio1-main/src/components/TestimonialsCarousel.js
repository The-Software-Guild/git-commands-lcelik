import React from 'react';
import { Carousel } from 'react-responsive-carousel';
import 'react-responsive-carousel/lib/styles/carousel.min.css';
// AVATARS IMPORTS
import avatar1 from '../avatars/avatar1.png';
import avatar2 from '../avatars/avatar2.png';
import avatar3 from '../avatars/avatar3.png';
import avatar4 from '../avatars/avatar4.png';

const TestimonialsCarousel = () => {
    return (
        <Carousel
        showArrows={true}
        infiniteLoop={true}
        showThumbs={false}
        showStatus={false}
        autoPlay={true}
        interval={3000}>
            <>
            <img src={avatar1} alt='Avatar'/>
            <div className='myCarousel'>
            <h3>Professional developer</h3>
            <p>Lidija has been an absolute joy to work with and train...</p>
            </div>
            </>

            <>
            <img src={avatar2} alt='Avatar'/>
            <div className='myCarousel'>
            <h3>Sister</h3>
            <p>Lidija is the best front end developer in the family.</p>
            </div>
            </>

            <>
            <img src={avatar3} alt='Avatar'/>
            <div className='myCarousel'>
            <h3>Next door neighbour</h3>
            <p>I don't know what this front end malarkey is, but can you please fix my laptop again?</p>
            </div>
            </>

            <>
            <img src={avatar4} alt='Avatar'/>
            <div className='myCarousel'>
            <h3>Sofia the Dog</h3>
            <p>I don't like it! I haven't been on as many walks since this front end thing started grrrr...
            </p>
            </div>
            </>
        </Carousel>
    )
}

export default TestimonialsCarousel;