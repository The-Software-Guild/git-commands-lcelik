import React from 'react';
import {
    FacebookShareButton,
    FacebookIcon,
    TwitterShareButton,
    TwitterIcon,
    LinkedinShareButton,
    LinkedinIcon

} from 'react-share';

const Footer = () => {
    return (
        <div className='footer'>
          <div className='container'>
            <div className='row'>
               <div className='col-lg-4 col-md-6 col-sm-6'>
                 <div className='d-flex'>
                    <p>London, United Kingdom</p> 
                 </div>
                 <div className='d-flex'>
                    <a href='tel:07384614873'>+447384614863</a>
                 </div>
                 <div className='d-flex'>
                    <p>lidijacelik87@gmail.com</p>
                 </div>
               </div>
               <div className='col-lg-3 col-md-2 col-sm-6'>
                  <div className='row'>
                    <div className='col'>
                       <a className='footer-nav'>Home</a>
                       <br/>
                       <a className='footer-nav'>About me</a>
                       <br/>
                       <a className='footer-nav'>Services</a>
                    </div>
                    <div className='col'>
                       <a className='footer-nav'>Portfolio</a>
                       <br/>
                       <a className='footer-nav'>Contacts</a>
                    </div>
                  </div>
               </div>
               <div className='col-lg-5 col-md-5 col-sm-6 align-items-center'>
                   <div className='d-flex justify-content-center'>
                       <FacebookShareButton
                         url={'https://www.facebook.com/profile.php?id=507650953'}
                         hashtag='#frontenddevelopment' 
                         quote={'FrontEnd Developer'}
                       >
                           <FacebookIcon className='mx-3' size={36}/>
                       </FacebookShareButton>

                       <TwitterShareButton
                         url={'https://www.facebook.com/profile.php?id=507650953'}
                         hashtag='#frontenddevelopment' 
                         quote={'FrontEnd Developer'}
                       >
                           <TwitterIcon className='mx-3' size={36}/>
                       </TwitterShareButton>

                       <LinkedinShareButton
                         url={'https://www.facebook.com/profile.php?id=507650953'}
                         hashtag='#frontenddevelopment' 
                         quote={'FrontEnd Developer'}
                       >
                           <LinkedinIcon className='mx-3' size={36}/>
                       </LinkedinShareButton>
                   </div>
                   <p className='pt-3 text-center'>
                       Copyright&copy;
                       {new Date().getFullYear()}&nbsp; Lidija Celik | All Rights Reserved
                   </p>
               </div>
            </div>
          </div>
        </div>
    )
}

export default Footer;