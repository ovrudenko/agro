/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $('#enter div').hide();
    $('#qqq').toggle(function() {
        $(this)
        .addClass('active')
        .next('#login')
        .animate({
            'height':'show'
        }, {
            duration: 'slow',
            easing: 'swing'
        });
    }, function() {
        $(this)
        .removeClass('active')
        .next('#login')
        .slideUp();
    });
    $('#login :submit').click(function() {
        $(this)
        .parent()
        .prev('#qqq')
        .click();
    });
});

