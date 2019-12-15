import qs from 'query-string';

export const formatNumber = val => (val ? val.toFixed(2) : '');

export const getURLQueryStringObj = () => qs.parse(window.location.hash.substring(window.location.hash.lastIndexOf('?')));
