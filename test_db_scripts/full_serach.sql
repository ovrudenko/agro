--explain 
select text from advert where to_tsvector('russian', text) @@ to_tsquery('russian', 'мука & ржан & опт') 