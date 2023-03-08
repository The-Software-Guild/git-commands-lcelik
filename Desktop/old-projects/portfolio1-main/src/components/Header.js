import React from 'react';
import Typed from 'react-typed';

const Header = () => {
    return (
        <div id='home' className='header-wraper'>
           <div className='main-info'>
              <h1>front end developer</h1>
              <Typed 
                className='typed-text'
                strings={['HTML', 'CSS', 'Javascript', 'React']}
                typeSpeed={40}
                backSpeed={60}
                loop
              />
              <a href='#' className='btn-main-offer'>contact me</a>
           </div>
        </div>
    )
}

export default Header;